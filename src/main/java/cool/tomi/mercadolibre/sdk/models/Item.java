package cool.tomi.mercadolibre.sdk.models;

import cool.tomi.mercadolibre.sdk.constants.MercadoLibre;

import java.math.BigDecimal;
import java.util.List;

public class Item {

    private String id;
    private MercadoLibre.Site siteId;
    private String title;
    private String categoryId;
    private BigDecimal price;
    private String currencyId;
    private Integer availableQuantity;
    private String buyingMode;
    private String listingTypeId;
    private String condition;
    private ItemDescription description;
    private List<ItemImage> pictures;
    private String sellerCustomField;
    private String permalink;
    private String status;
    private Long sellerId;

    public Item() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MercadoLibre.Site getSiteId() {
        return siteId;
    }

    public void setSiteId(MercadoLibre.Site siteId) {
        this.siteId = siteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getBuyingMode() {
        return buyingMode;
    }

    public void setBuyingMode(String buyingMode) {
        this.buyingMode = buyingMode;
    }

    public String getListingTypeId() {
        return listingTypeId;
    }

    public void setListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ItemDescription getDescription() {
        return description;
    }

    public void setDescription(ItemDescription description) {
        this.description = description;
    }

    public List<ItemImage> getPictures() {
        return pictures;
    }

    public void setPictures(List<ItemImage> pictures) {
        this.pictures = pictures;
    }

    public String getSellerCustomField() {
        return sellerCustomField;
    }

    public void setSellerCustomField(String sellerCustomField) {
        this.sellerCustomField = sellerCustomField;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", siteId='" + siteId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", price=" + price +
                ", currencyId='" + currencyId + '\'' +
                ", availableQuantity=" + availableQuantity +
                ", buyingMode='" + buyingMode + '\'' +
                ", listingTypeId='" + listingTypeId + '\'' +
                ", condition='" + condition + '\'' +
                ", description=" + description +
                ", pictures=" + pictures +
                ", sellerCustomField='" + sellerCustomField + '\'' +
                ", permalink='" + permalink + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
