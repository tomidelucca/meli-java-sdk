package cool.tomi.utils.rest;

import java.util.HashMap;
import java.util.Map;

public class ServiceConfiguration {

    private final String base;
    private final String path;
    private final HttpMethod method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final Object body;
    private final String mediaType;

    private ServiceConfiguration(final Builder builder) {
        this.base = builder.base;
        this.path = builder.path;
        this.method = builder.method;
        this.headers = builder.headers == null ? new HashMap<String, String>() : builder.headers;
        this.queryParams = builder.queryParams == null ? new HashMap<String, String>() : builder.queryParams;
        this.mediaType = builder.mediaType;
        this.body = builder.body;
    }

    public String getBase() {
        return base;
    }

    public String getPath() {
        return path;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getMediaType() {
        return mediaType;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public Object getBody() {
        return body;
    }

    public static class Builder {

        private String base;
        private String path;
        private HttpMethod method = HttpMethod.GET;
        private Map<String, String> headers;
        private Map<String, String> queryParams;
        private Object body;
        private String mediaType;

        public Builder() {

        }

        public Builder(final ServiceConfiguration configuration) {
            this.base = configuration.base;
            this.path = configuration.path;
            this.method = configuration.method;
            this.headers = configuration.headers;
            this.queryParams = configuration.queryParams;
            this.body = configuration.body;
            this.mediaType = configuration.mediaType;
        }

        public Builder base(final String base) {
            this.base = base;
            return this;
        }

        public Builder path(final String path) {
            this.path = path;
            return this;
        }

        public Builder httpMethod(final HttpMethod method) {
            this.method = method;
            return this;
        }

        public Builder headers(final Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder addHeader(final String key, final String value) {
            if (this.headers == null) {
                this.headers = new HashMap<>();
            }
            if (key != null && value != null) {
                this.headers.put(key, value);
            }
            return this;
        }

        public Builder queryParams(final Map<String, String> queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public Builder addQueryParam(final String key, final String value) {
            if (this.queryParams == null) {
                this.queryParams = new HashMap<>();
            }
            if (key != null && value != null) {
                this.queryParams.put(key, value);
            }
            return this;
        }

        public Builder mediaType(final String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder body(final Object body) {
            this.body = body;
            return this;
        }

        public ServiceConfiguration build() {
            return new ServiceConfiguration(this);
        }
    }
}
