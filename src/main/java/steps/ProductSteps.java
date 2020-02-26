package steps;


import net.thucydides.core.annotations.Step;
import page.ProductPage;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.HeaderPage;
import page.ProductsListPage;

public class ProductSteps {
    ProductPage productPage;
    HeaderPage headerPage;
    ProductsListPage productsListPage;

    @Step
    public void selectProduct() {
        productPage.selectSpecificProduct();
    }

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
        productsListPage.getRandomProduct();
        productPage.getRandomProperties();
    }
}
