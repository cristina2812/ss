package factory;

import models.SubCategory;

public class SubCategoryFactory {

    public SubCategory getSubCategory() {

        SubCategory subCategory = new SubCategory();
        return subCategory;
    }

    public String getName() {

        SubCategory subCategory = new SubCategory();
        String name = subCategory.getSubcategoryName();
        return  name;

    }



}
