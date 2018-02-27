package cool.tomi.mercadolibre.sdk.models;

public class Authentication {

    private String accessToken;
    private String refreshToken;
    private Long expiresIn;

    /*package*/ Authentication() {

    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}
