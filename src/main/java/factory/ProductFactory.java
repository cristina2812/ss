package factory;

import models.Product;

public class ProductFactory {

    public Product getProduct() {
        Product product = new Product();

        product.setName("shirt");
        product.setDescription("cotton");
        product.setPriceTo("200");
        product.setPriceFrom("1");
        product.setSelectColour("Red");
        product.setSelectSize("S");
        product.setSelectGender("Male");

        return product;
    }

}
