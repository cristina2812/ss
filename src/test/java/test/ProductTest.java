package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.ProductsListPage;
import steps.HeaderSteps;
import steps.ProductSteps;


@RunWith(SerenityRunner.class)
public class ProductTest extends BaseTest {
    @Steps
    ProductSteps productSteps;

    @Steps
    ProductsListPage productsListPage;

    @Steps
    HeaderSteps headerSteps;

//    Product product;

    @Test
    public void testClickOnSimpleProduct(){
        headerSteps.insertKeywordInSearchField("glass");
        productsListPage.clickOnRandomProductFromList();
        productSteps.clickAddToCart();
    }

    @Test
    public void testRandomCustomProduct() throws InterruptedException {
//        headerSteps.insertKeywordInSearchField("pants");
//        productSteps.selectCustomProduct();
        productSteps.getProperties();
        productSteps.clickAddToCart();
    }

    @Test
    public void testProductPropertiesFromPage() {
        headerSteps.insertKeywordInSearchField("glass");
        productSteps.selectCustomProduct();
        productSteps.returnProductName();
        productSteps.returnProductPrice();
    }





}
