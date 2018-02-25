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

    public Category() {

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
}
