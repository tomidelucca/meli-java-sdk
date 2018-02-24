package cool.tomi.models;

public class ItemImage {

    private String id;
    private String source;
    private String url;
    private String secureUrl;

    public ItemImage(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSecureUrl() {
        return secureUrl;
    }

    public void setSecureUrl(String secureUrl) {
        this.secureUrl = secureUrl;
    }

    @Override
    public String toString() {
        return "ItemImage{" +
                "id='" + id + '\'' +
                ", source='" + source + '\'' +
                ", url='" + url + '\'' +
                ", secureUrl='" + secureUrl + '\'' +
                '}';
    }
}
