package factory;

import models.Product;

public class ProductFactory {

    public Product getProduct() {

        Product availableProduct = new Product();

        availableProduct.setName("shirt");
        availableProduct.setDescription("cotton");
        availableProduct.setPriceTo("200");
        availableProduct.setPriceFrom("1");
        availableProduct.setSelectColour("Red");
        availableProduct.setSelectSize("S");
        availableProduct.setSelectGender("Male");

        return availableProduct;

    }

    public Product getUnavailableProduct() {

        Product unavailableProduct = new Product();

        unavailableProduct.setName("jeans");
        unavailableProduct.setDescription("denim");
        unavailableProduct.setPriceFrom("0");
        unavailableProduct.setPriceTo("350");
        unavailableProduct.setSelectColour("Blue");
        unavailableProduct.setSelectSize("28");
        unavailableProduct.setSelectGender("Female");

        return unavailableProduct;

    }

}
