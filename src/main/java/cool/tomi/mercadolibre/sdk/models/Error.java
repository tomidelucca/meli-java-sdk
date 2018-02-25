package cool.tomi.mercadolibre.sdk.models;

public class Error {

    private String message;
    private String error;
    private Integer status;

    /*package*/ Error() {

    }

    public Error(Error.Builder builder) {
        this.message = builder.message;
        this.error = builder.error;
        this.status = builder.status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(final Integer status) {
        this.status = status;
    }

    public Boolean isUnauthorized() {
        return this.status == 401;
    }

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                ", error='" + error + '\'' +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private String message;
        private String error;
        private Integer status;

        public Builder() {

        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setError(String error) {
            this.error = error;
            return this;
        }

        public Builder setStatus(Integer status) {
            this.status = status;
            return this;
        }

        public Error build() {
            return new Error(this);
        }
    }
}
