package cool.tomi.mercadolibre.sdk.utils.rest;

import cool.tomi.mercadolibre.sdk.utils.Either;
import cool.tomi.mercadolibre.sdk.utils.gson.GsonHelper;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;

public enum RestHelper {

    INSTANCE;

    private OkHttpClient client = new OkHttpClient.Builder().build();

    public Response execute(final ServiceConfiguration configuration) {

        HttpUrl.Builder urlBuilder = HttpUrl.parse(configuration.getBase() + configuration.getPath()).newBuilder();

        Map<String, String> queryParams = configuration.getQueryParams();

        for (String key : queryParams.keySet()) {
            urlBuilder.addQueryParameter(key, queryParams.get(key));
        }

        Request.Builder requestBuilder = new Request.Builder().url(urlBuilder.build());

        for (String key: configuration.getHeaders().keySet()) {
            requestBuilder.addHeader(key, configuration.getHeaders().get(key));
        }

        RequestBody body = null;

        if (configuration.getBody() != null) {
            String bodyString = GsonHelper.INSTANCE.getGson().toJson(configuration.getBody());
            body = RequestBody.create(MediaType.parse(configuration.getMediaType()), bodyString);
        }

        requestBuilder.method(configuration.getMethod().value(), body);

        try {
            return client.newCall(requestBuilder.build()).execute();
        } catch (IOException e) {
            return null;
        }
    }

    public static <S, F> Either<S, F> responseToEither(final Response response, final Class<S> successClass,
                                                       final Class<F> failureClass) {

        if (response == null) {
            try {
                return Either.alternative(failureClass.newInstance());
            } catch (Exception ignored) {
                return null;
            }
        }

        if (response.isSuccessful()) {
            return Either.value(GsonHelper.INSTANCE.fromJson(response, successClass));
        }

        return Either.alternative(GsonHelper.INSTANCE.fromJson(response, failureClass));
    }
}
