package cool.tomi.mercadolibre.sdk.models;

import java.util.List;

public class Category {

    private String id;
    private String name;
    private CategorySettings settings;
    private Integer totalItemsInThisCategory;
    private List<Category> pathFromRoot;
    private List<Category> childrenCategories;
    private String attributeTypes;

    /*package*/ Category() {

    }

    public Category(Category.Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.settings = builder.settings;
        this.totalItemsInThisCategory = builder.totalItemsInThisCategory;
        this.pathFromRoot = builder.pathFromRoot;
        this.childrenCategories = builder.childrenCategories;
        this.attributeTypes = builder.attributeTypes;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public CategorySettings getSettings() {
        return settings;
    }

    public void setSettings(final CategorySettings settings) {
        this.settings = settings;
    }

    public Integer getTotalItemsInThisCategory() {
        return totalItemsInThisCategory;
    }

    public void setTotalItemsInThisCategory(final Integer totalItemsInThisCategory) {
        this.totalItemsInThisCategory = totalItemsInThisCategory;
    }

    public List<Category> getPathFromRoot() {
        return pathFromRoot;
    }

    public void setPathFromRoot(final List<Category> pathFromRoot) {
        this.pathFromRoot = pathFromRoot;
    }

    public List<Category> getChildrenCategories() {
        return childrenCategories;
    }

    public void setChildrenCategories(final List<Category> childrenCategories) {
        this.childrenCategories = childrenCategories;
    }

    public String getAttributeTypes() {
        return attributeTypes;
    }

    public void setAttributeTypes(final String attributeTypes) {
        this.attributeTypes = attributeTypes;
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

    public static class Builder {
        private String id;
        private String name;
        private CategorySettings settings;
        private Integer totalItemsInThisCategory;
        private List<Category> pathFromRoot;
        private List<Category> childrenCategories;
        private String attributeTypes;

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

        public Builder setSettings(CategorySettings settings) {
            this.settings = settings;
            return this;
        }

        public Builder setTotalItemsInThisCategory(Integer totalItemsInThisCategory) {
            this.totalItemsInThisCategory = totalItemsInThisCategory;
            return this;
        }

        public Builder setPathFromRoot(List<Category> pathFromRoot) {
            this.pathFromRoot = pathFromRoot;
            return this;
        }

        public Builder setChildrenCategories(List<Category> childrenCategories) {
            this.childrenCategories = childrenCategories;
            return this;
        }

        public Builder setAttributeTypes(String attributeTypes) {
            this.attributeTypes = attributeTypes;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}
