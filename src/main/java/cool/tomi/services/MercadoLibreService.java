package cool.tomi.services;

import cool.tomi.interfaces.ReauthenticationProvider;
import cool.tomi.models.Authentication;
import cool.tomi.utils.rest.RestHelper;
import cool.tomi.utils.rest.ServiceConfiguration;
import okhttp3.Response;

public abstract class MercadoLibreService {

    private static final String BASE_URL = "https://api.mercadolibre.com";
    private static final String MEDIA_TYPE = "application/json; charset=utf-8";
    private static final String CONTENT_TYPE = "application/json";

    private ReauthenticationProvider reauthenticationProvider;

    protected Response execute(final ServiceConfiguration configuration) {

        Response response = RestHelper.INSTANCE.execute(configuration);

        if (MercadoLibreService.requiresAuthentication(response) && reauthenticationProvider != null) {
            Authentication authentication = reauthenticationProvider.reauthorize();
            ServiceConfiguration newConfiguration = new ServiceConfiguration.Builder(configuration)
                    .addQueryParam("access_token", authentication.getAccessToken())
                    .build();
            response = RestHelper.INSTANCE.execute(newConfiguration);
        }

        return response;
    }

    protected static ServiceConfiguration.Builder defaultConfiguration() {
        return new ServiceConfiguration.Builder()
                .base(BASE_URL)
                .addHeader("Accept", CONTENT_TYPE)
                .mediaType(MEDIA_TYPE);
    }

    protected static ServiceConfiguration.Builder authenticatedConfiguration(final String accessToken) {
        return defaultConfiguration().addQueryParam("access_token", accessToken);
    }

    private static Boolean requiresAuthentication(Response response) {
        return response.code() == 401;
    }

    public ReauthenticationProvider getReauthenticationProvider() {
        return reauthenticationProvider;
    }

    public void setReauthenticationProvider(ReauthenticationProvider reauthenticationProvider) {
        this.reauthenticationProvider = reauthenticationProvider;
    }
}
