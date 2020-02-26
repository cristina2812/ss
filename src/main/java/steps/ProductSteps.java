package steps;


import net.thucydides.core.annotations.Step;
import page.ProductPage;

import page.HeaderPage;
import page.ProductsListPage;

public class ProductSteps {
    ProductPage productPage;
    HeaderPage headerPage;
    ProductsListPage productsListPage;


    @Step
    public void selectCustomProduct() {
        productsListPage.clickOnRandomProductFromList();
    }


    @Step
    public void getProperties() {
        System.out.println(productPage.getColorListSize());
        productPage.getRandomProperties();
    }


    @Step
    public void insertKeywordInSearchField(String key) {
        headerPage.changeFieldSearch(key);
        headerPage.clickSearchBtn();
    }

    @Step
    public void clickAddToCart() {
        productPage.addToCart();
    }
}
