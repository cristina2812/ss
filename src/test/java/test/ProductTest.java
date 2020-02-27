package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.ProductsListPage;
import steps.HeaderSteps;
import steps.ProductSteps;


@RunWith(SerenityRunner.class)
public class ProductTest extends BaseTest{

    @Steps
    ProductSteps productSteps;

    @Steps
    ProductsListPage productsListPage;

    @Steps
    HeaderSteps headerSteps;

    @Test
    public void clickOnSimpleProduct(){
        headerSteps.insertKeywordInSearchField("glass");
        productsListPage.clickOnRandomProductFromList();
        productSteps.clickAddToCart();
    }

    @Test
    public void getRandomCustomProduct() {
        headerSteps.insertKeywordInSearchField("pants");
        productSteps.selectCustomProduct();
        productSteps.getProperties();
        productSteps.clickAddToCart();
    }

    @Test
    public void getProductNameFromPage() {
        headerSteps.insertKeywordInSearchField("glass");
        productSteps.selectCustomProduct();
        productSteps.getProductName();
    }


}
