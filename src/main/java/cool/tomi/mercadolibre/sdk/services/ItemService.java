package cool.tomi.mercadolibre.sdk.services;

import cool.tomi.mercadolibre.sdk.models.Error;
import cool.tomi.mercadolibre.sdk.models.Item;
import cool.tomi.mercadolibre.sdk.utils.Either;
import cool.tomi.mercadolibre.sdk.utils.rest.HttpMethod;
import cool.tomi.mercadolibre.sdk.utils.rest.RestHelper;
import cool.tomi.mercadolibre.sdk.utils.rest.ServiceConfiguration;
import okhttp3.Response;

public class ItemService extends MercadoLibreService {

    private static final String GET_ITEM_PATH = "/items/{id}";
    private static final String CREATE_ITEM_PATH = "/items";
    private static final String UPDATE_ITEM_PATH = "/items/{id}";
    private static final String RELIST_ITEM_PATH = "/items/{id}/relist";

    public static ItemService getService() {
        return new ItemService();
    }

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
        String itemId = item.getId();
        String path = UPDATE_ITEM_PATH.replace("{id}", item.getId());
        item.setId(null);
        ServiceConfiguration configuration = MercadoLibreService.authenticatedConfiguration(accessToken)
                .path(path)
                .httpMethod(HttpMethod.PUT)
                .body(item)
                .build();

        Response response = execute(configuration);
        item.setId(itemId);
        return RestHelper.responseToEither(response, Item.class, Error.class);
    }

    public Either<Item, Error> relistItem(final Item item, final String accessToken) {
        String path = RELIST_ITEM_PATH.replace("{id}", item.getId());

        Item.Relist itemRelist = item.relistItem();

        ServiceConfiguration configuration = MercadoLibreService.authenticatedConfiguration(accessToken)
                .path(path)
                .body(itemRelist)
                .httpMethod(HttpMethod.POST)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Item.class, Error.class);
    }
}
