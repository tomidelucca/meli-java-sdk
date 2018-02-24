package cool.tomi.services;

import cool.tomi.constants.MercadoLibre;
import cool.tomi.models.Category;
import cool.tomi.models.Error;
import cool.tomi.utils.Either;
import cool.tomi.utils.rest.RestHelper;
import cool.tomi.utils.rest.ServiceConfiguration;
import okhttp3.Response;

public class CategoryService extends MercadoLibreService {

    private static final String GET_ALL_CATEGORIES_PATH = "/sites/{site_id}/categories";
    private static final String GET_CATEGORY_PATH = "/categories";

    public CategoryService() {

    }

    public Either<Category[], Error> getAllCategories(final MercadoLibre.Site site) {
        String path = GET_ALL_CATEGORIES_PATH.replace("{site_id}", site.id());

        ServiceConfiguration configuration = MercadoLibreService.defaultConfiguration()
                .path(path)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Category[].class, Error.class);
    }

    public Either<Category, Error> getCategoryWithId(final String id) {
        ServiceConfiguration configuration = MercadoLibreService.defaultConfiguration()
                .path(GET_CATEGORY_PATH + '/' + id)
                .build();

        Response response = execute(configuration);
        return RestHelper.responseToEither(response, Category.class, Error.class);
    }

}
