package cool.tomi.interfaces;

import cool.tomi.models.Authentication;

public interface ReauthenticationProvider {
    Authentication reauthorize();
}
