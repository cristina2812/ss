package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.CheckoutSteps;
import steps.HeaderSteps;
import steps.LoginSteps;
import steps.ProductSteps;

@RunWith(SerenityRunner.class)
public class OrderTest extends BaseTest {
    @Steps
    CheckoutSteps checkoutSteps;

    @Steps
    ProductSteps productSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    LoginSteps loginSteps;


    @Test
    public void orderTest() throws InterruptedException {


        //login with correct email and password
        headerSteps.clickLoginBtn();
        loginSteps.fillLoginData();
        loginSteps.clickOnLoginButton();

        //add custom product
        headerSteps.insertKeywordInSearchField("pants");
        productSteps.selectCustomProduct();
        productSteps.getProperties();
        productSteps.clickAddToCart();


        //add simple product
        headerSteps.insertKeywordInSearchField("glass");
        productSteps.clickOnSimpleProductPage();
        productSteps.clickAddToCart();

        //click checkout button
        checkoutSteps.clickCheckOutButton();


        //click continue billing information
        checkoutSteps.clickOnContinueButtonCheckoutlogin();
        checkoutSteps.clickOnContinueShippingButton();


        checkoutSteps.clickOnContinueButtonFromShippingInformation();
        checkoutSteps.clickShippingMethod();

        checkoutSteps.clickPaymentInformation();
        checkoutSteps.clickOrderReview();


    }

}
