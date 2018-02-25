package cool.tomi.mercadolibre.sdk.services;

import cool.tomi.mercadolibre.sdk.models.Authentication;
import cool.tomi.mercadolibre.sdk.models.Error;
import cool.tomi.mercadolibre.sdk.utils.Either;
import cool.tomi.mercadolibre.sdk.utils.rest.HttpMethod;
import cool.tomi.mercadolibre.sdk.utils.rest.RestHelper;
import cool.tomi.mercadolibre.sdk.utils.rest.ServiceConfiguration;
import okhttp3.Response;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService extends MercadoLibreService {

    private static final String AUTHORIZATION_PATH = "/oauth/token";

    private static final String GRANT_TYPE_AUTHORIZATION_CODE = "authorization_code";
    private static final String GRANT_TYPE_REFRESH_TOKEN = "refresh_token";

    private Long clientId;
    private String clientSecret;

    public AuthenticationService(final Long clientId, final String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public Either<Authentication, Error> authorize(final String code, final String redirectUri) {
        Map<String, String> params = new HashMap<>();
        params.put("grant_type", GRANT_TYPE_AUTHORIZATION_CODE);
        params.put("client_id", this.clientId.toString());
        params.put("client_secret", this.clientSecret);
        params.put("code", code);
        params.put("redirect_uri", redirectUri);

        ServiceConfiguration configuration = MercadoLibreService.defaultConfiguration()
                .path(AUTHORIZATION_PATH)
                .httpMethod(HttpMethod.POST)
                .queryParams(params)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Authentication.class, Error.class);
    }

    public Either<Authentication, Error> refreshAccessToken(final String refreshToken) {
        Map<String, String> params = new HashMap<>();
        params.put("grant_type", GRANT_TYPE_REFRESH_TOKEN);
        params.put("client_id", this.clientId.toString());
        params.put("client_secret", this.clientSecret);
        params.put("refresh_token", refreshToken);

        ServiceConfiguration configuration = MercadoLibreService.defaultConfiguration()
                .path(AUTHORIZATION_PATH)
                .httpMethod(HttpMethod.POST)
                .queryParams(params)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Authentication.class, Error.class);
    }
}
