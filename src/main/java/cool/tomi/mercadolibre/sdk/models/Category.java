package cool.tomi.mercadolibre.sdk.models;

import java.util.List;

public class Category {

    private String id;
    private String name;
    private Settings settings;
    private Integer totalItemsInThisCategory;
    private List<Category> pathFromRoot;
    private List<Category> childrenCategories;
    private String attributeTypes;

    /*package*/ Category() {

    }

    public Category(Category.Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Settings getSettings() {
        return settings;
    }

    public Integer getTotalItemsInThisCategory() {
        return totalItemsInThisCategory;
    }

    public List<Category> getPathFromRoot() {
        return pathFromRoot;
    }

    public List<Category> getChildrenCategories() {
        return childrenCategories;
    }

    public String getAttributeTypes() {
        return attributeTypes;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", settings=" + settings +
                ", totalItemsInThisCategory=" + totalItemsInThisCategory +
                ", pathFromRoot=" + pathFromRoot +
                ", childrenCategories=" + childrenCategories +
                ", attributeTypes='" + attributeTypes + '\'' +
                '}';
    }

    public class Settings {

        private Boolean listingAllowed;
        private Integer maxTitleLength;
        private List<String> itemConditions;

        /*package*/ Settings() {

        }

        public Boolean getListingAllowed() {
            return listingAllowed;
        }

        public Integer getMaxTitleLength() {
            return maxTitleLength;
        }

        public List<String> getItemConditions() {
            return itemConditions;
        }

        @Override
        public String toString() {
            return "Settings{" +
                    "listingAllowed=" + listingAllowed +
                    ", maxTitleLength=" + maxTitleLength +
                    ", itemConditions=" + itemConditions +
                    '}';
        }
    }

    public static class Builder {
        private String id;
        private String name;

        public Builder() {

        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}
