package cool.tomi.utils.rest;

public enum HttpMethod {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    HEAD("HEAD"),
    OPTIONS("OPTIONS");

    private final String method;

    HttpMethod(final String method) {
        this.method = method;
    }

    public String value() {
        return method;
    }

}
