package cool.tomi.mercadolibre.sdk.models;

import java.util.List;

public class CategorySettings {

    private Boolean listingAllowed;
    private Integer maxTitleLength;
    private List<String> itemConditions;

    public CategorySettings() {

    }

    public Boolean getListingAllowed() {
        return listingAllowed;
    }

    public void setListingAllowed(final Boolean listingAllowed) {
        this.listingAllowed = listingAllowed;
    }

    public Integer getMaxTitleLength() {
        return maxTitleLength;
    }

    public void setMaxTitleLength(final Integer maxTitleLength) {
        this.maxTitleLength = maxTitleLength;
    }

    public List<String> getItemConditions() {
        return itemConditions;
    }

    public void setItemConditions(final List<String> itemConditions) {
        this.itemConditions = itemConditions;
    }

    @Override
    public String toString() {
        return "CategorySettings{" +
                "listingAllowed=" + listingAllowed +
                ", maxTitleLength=" + maxTitleLength +
                ", itemConditions=" + itemConditions +
                '}';
    }
}
