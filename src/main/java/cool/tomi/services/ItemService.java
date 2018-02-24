package cool.tomi.services;

import cool.tomi.models.Error;
import cool.tomi.models.Item;
import cool.tomi.utils.Either;
import cool.tomi.utils.rest.HttpMethod;
import cool.tomi.utils.rest.RestHelper;
import cool.tomi.utils.rest.ServiceConfiguration;
import okhttp3.Response;

public class ItemService extends MercadoLibreService {

    private static final String GET_ITEM_PATH = "/items/{id}";
    private static final String CREATE_ITEM_PATH = "/items";
    private static final String UPDATE_ITEM_PATH = "/items/{id}";

    public ItemService() {}

    public Either<Item, Error> getItemWithId(final String id) {
        return getItemWithId(id, null);
    }

    public Either<Item, Error> getItemWithId(final String id, final String accessToken) {
        String path = GET_ITEM_PATH.replace("{id}", id);

        ServiceConfiguration configuration = MercadoLibreService.authenticatedConfiguration(accessToken)
                .path(path)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Item.class, Error.class);
    }

    public Either<Item, Error> createItem(final Item item, final String accessToken) {
        ServiceConfiguration configuration = MercadoLibreService.authenticatedConfiguration(accessToken)
                .path(CREATE_ITEM_PATH)
                .httpMethod(HttpMethod.POST)
                .body(item)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Item.class, Error.class);
    }

    public Either<Item, Error> updateItem(final Item item, final String accessToken) {
        String path = UPDATE_ITEM_PATH.replace("{id}", item.getId());

        ServiceConfiguration configuration = MercadoLibreService.authenticatedConfiguration(accessToken)
                .path(path)
                .httpMethod(HttpMethod.PUT)
                .body(item)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Item.class, Error.class);
    }
}
