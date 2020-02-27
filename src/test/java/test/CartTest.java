package test;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import okhttp3.Cookie;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.ProductPage;
import page.ProductsListPage;
import steps.CartSteps;
import steps.HeaderSteps;
import steps.ProductSteps;

@RunWith(SerenityRunner.class)
public class CartTest extends BaseTest {

    @Steps
    CartSteps cartSteps;
    @Steps
    HeaderSteps headerSteps;
    @Steps
    ProductSteps productSteps;
    @Steps
    ProductsListPage productsListPage;

    ProductPage productPage;

    @Test
    public void clickOnCartIconBtn() {
        cartSteps.clickOnCart();
    }

    @Test
    public void checkIfCartContainsZeroProduct() {
        cartSteps.clickOnCart();
        cartSteps.checkCartWrapperExist();
        cartSteps.checkCartWrapperMessage("You have no items in your shopping cart.");
    }

    @Test
    public void checkIfCartContainsProducts() {
        headerSteps.insertKeywordInSearchField("glass");
        productsListPage.clickOnRandomProductFromList();
        productSteps.verifyCartProductName();
        productSteps.clickAddToCart();
        cartSteps.checkProductNameFromCartPage();
        cartSteps.checkProductNameFromCartContainsInitialName();
    }




}
