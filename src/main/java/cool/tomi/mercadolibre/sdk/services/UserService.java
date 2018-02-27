package cool.tomi.mercadolibre.sdk.services;

import cool.tomi.mercadolibre.sdk.models.Error;
import cool.tomi.mercadolibre.sdk.models.User;
import cool.tomi.mercadolibre.sdk.utils.Either;
import cool.tomi.mercadolibre.sdk.utils.rest.RestHelper;
import cool.tomi.mercadolibre.sdk.utils.rest.ServiceConfiguration;
import okhttp3.Response;

public class UserService extends MercadoLibreService {

    private static final String GET_CURRENT_USER_PATH = "/users/me";
    private static final String GET_USER_PATH = "/users/{user_id}";

    public static UserService getService() {
        return new UserService();
    }

    public Either<User, Error> currentUser(final String accessToken) {
        ServiceConfiguration configuration = MercadoLibreService.authenticatedConfiguration(accessToken)
                .path(GET_CURRENT_USER_PATH)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, User.class, Error.class);
    }

    public Either<User, Error> getUserWithId(final Long id) {
        return getUserWithId(id, null);
    }

    public Either<User, Error> getUserWithId(final Long id, final String accessToken) {
        ServiceConfiguration configuration = MercadoLibreService.authenticatedConfiguration(accessToken)
                .path(GET_USER_PATH.replace("{user_id}", id.toString()))
                .build();
        Response response = execute(configuration);
        return RestHelper.responseToEither(response, User.class, Error.class);
    }
}
