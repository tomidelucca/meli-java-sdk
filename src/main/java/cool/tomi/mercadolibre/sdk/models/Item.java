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
    private Description description;
    private List<Image> pictures;
    private String sellerCustomField;
    private String permalink;
    private String status;
    private Long sellerId;

    /*package*/ Item() {

    }

    public Item(Builder builder) {
        this.id = builder.id;
        this.siteId = builder.siteId;
        this.title = builder.title;
        this.categoryId = builder.categoryId;
        this.price = builder.price;
        this.currencyId = builder.currencyId;
        this.availableQuantity = builder.availableQuantity;
        this.buyingMode = builder.buyingMode;
        this.listingTypeId = builder.listingTypeId;
        this.condition = builder.condition;
        this.description = builder.description;
        this.pictures = builder.pictures;
        this.sellerCustomField = builder.sellerCustomField;
        this.permalink = builder.permalink;
        this.status = builder.status;
        this.sellerId = builder.sellerId;
    }

    public Relist relistItem() {
        return new Relist(this);
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

    public Description getDescription() {
        return description;
    }

    public Item setDescription(Description description) {
        this.description = description;
        return this;
    }

    public List<Image> getPictures() {
        return pictures;
    }

    public Item setPictures(List<Image> pictures) {
        this.pictures = pictures;
        return this;
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

    public static class Description {

        private String plainText;

        /*oackage*/ Description() {

        }

        public Description(String plainText) {
            this.plainText = plainText;
        }

        public String getPlainText() {
            return plainText;
        }

        public void setPlainText(String plainText) {
            this.plainText = plainText;
        }

        @Override
        public String toString() {
            return plainText;
        }
    }

    public static class Image {

        private String id;
        private String source;
        private String url;
        private String secureUrl;

        /*package*/ Image() {

        }

        public Image(String source) {
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
            return "Image{" +
                    "id='" + id + '\'' +
                    ", source='" + source + '\'' +
                    ", url='" + url + '\'' +
                    ", secureUrl='" + secureUrl + '\'' +
                    '}';
        }
    }

    public class Relist {

        private BigDecimal price;
        private Integer quantity;
        private String listingTypeId;

        /*package*/ Relist() {

        }

        public Relist(final Item item) {
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
            return "Relist{" +
                    "price=" + price +
                    ", quantity=" + quantity +
                    ", listingTypeId='" + listingTypeId + '\'' +
                    '}';
        }
    }

    public static class Builder {

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
        private Description description;
        private List<Image> pictures;
        private String sellerCustomField;
        private String permalink;
        private String status;
        private Long sellerId;

        public Builder() {

        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSiteId(MercadoLibre.Site siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder setCurrencyId(String currencyId) {
            this.currencyId = currencyId;
            return this;
        }

        public Builder setAvailableQuantity(Integer availableQuantity) {
            this.availableQuantity = availableQuantity;
            return this;
        }

        public Builder setBuyingMode(String buyingMode) {
            this.buyingMode = buyingMode;
            return this;
        }

        public Builder setListingTypeId(String listingTypeId) {
            this.listingTypeId = listingTypeId;
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setDescription(Description description) {
            this.description = description;
            return this;
        }

        public Builder setPictures(List<Image> pictures) {
            this.pictures = pictures;
            return this;
        }

        public Builder setSellerCustomField(String sellerCustomField) {
            this.sellerCustomField = sellerCustomField;
            return this;
        }

        public Builder setPermalink(String permalink) {
            this.permalink = permalink;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }

}
