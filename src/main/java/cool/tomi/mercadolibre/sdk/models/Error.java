package cool.tomi.mercadolibre.sdk.models;

public class Error {

    public static final Error GENERIC = new Error("Generic error", "Couldn't generate a response", -1);

    private String message;
    private String error;
    private Integer status;

    /*package*/ Error() {

    }

    public Error(final String message, final String error, final Integer status) {
        this.message = message;
        this.error = error;
        this.status = status;
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
}
