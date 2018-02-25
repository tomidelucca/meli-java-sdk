package cool.tomi.mercadolibre.sdk.interfaces;

import cool.tomi.mercadolibre.sdk.models.Authentication;

public interface ReauthenticationProvider {
    Authentication reauthorize();
}
