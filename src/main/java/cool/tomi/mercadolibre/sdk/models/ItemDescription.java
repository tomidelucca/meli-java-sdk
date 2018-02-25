package cool.tomi.mercadolibre.sdk.models;

public class ItemDescription {

    private String plainText;

    public ItemDescription() {

    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    @Override
    public String toString() {
        return "ItemDescription{" +
                "plainText='" + plainText + '\'' +
                '}';
    }
}
