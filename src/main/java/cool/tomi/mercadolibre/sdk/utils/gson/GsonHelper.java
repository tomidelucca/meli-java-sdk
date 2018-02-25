package cool.tomi.mercadolibre.sdk.utils.gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.Response;

public enum GsonHelper {

    INSTANCE;

    private final Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    public Gson getGson() {
        return gson;
    }

    public <T> T fromJson(final Response response, final Class<T> classOfT) {
        T object = getGson().fromJson(response.body().charStream(), classOfT);
        response.close();
        return object;
    }
}
