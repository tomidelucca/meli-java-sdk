package cool.tomi.mercadolibre.sdk.models;

import java.math.BigDecimal;

public class ItemRelist {

    private BigDecimal price;
    private Integer quantity;
    private String listingTypeId;

    /*package*/ ItemRelist() {

    }

    public ItemRelist(final Item item) {
        this.price = item.getPrice();
        this.listingTypeId = item.getListingTypeId();
        this.quantity = item.getAvailableQuantity();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getListingTypeId() {
        return listingTypeId;
    }

    public void setListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
    }

    @Override
    public String toString() {
        return "ItemRelist{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", listingTypeId='" + listingTypeId + '\'' +
                '}';
    }
}
