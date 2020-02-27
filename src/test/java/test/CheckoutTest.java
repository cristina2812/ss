package test;

import models.UserGuest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.CheckoutSteps;
import steps.HeaderSteps;
import steps.ProductSteps;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest {

    @Steps
    CheckoutSteps checkoutSteps;

    @Steps
    ProductSteps productSteps;

    @Steps
    HeaderSteps headerSteps;


    @Test
    public void checkOutAsguest() {
        checkoutSteps.clickCheckoutBtn();
    }

    @Test
    public void testCheckoutBillingInfo() {
        UserGuest userGuest = new UserGuest();

        userGuest.setFirstName("Ionel");
        userGuest.setLastName("Maria");
        userGuest.setAddress("Strada Cafelei");
        userGuest.setEmail("ionel@gmail.com");
        userGuest.setCity("Cluj");
        userGuest.setTelephone("123123123");
        userGuest.setZipCode("1233333333");
        userGuest.setSelectCountry(userGuest.getSelectCountry());
        userGuest.setSelectState(userGuest.getSelectState());

        checkoutSteps.fillRegisterDataInBillingInfo();

    }

    @Test
    public void testSelectDifferentShipAddress() {
        checkoutSteps.clickSelectShipToDifferentAddress();
    }

    @Test
    public void testClickOnContinueButtonBillingInformation() {
        checkoutSteps.clickOnContinueButtonFromBillingInformationCheckout();
    }

    @Test
    public void testCheckoutShippingInfo() {

        UserGuest anotherUserGuest = new UserGuest();

        anotherUserGuest.setFirstName("Ionel Ionelule");
        anotherUserGuest.setLastName("Maria Ta");
        anotherUserGuest.setAddress("Strada Cafelei 2");
        anotherUserGuest.setEmail("ionelule@gmail.com");
        anotherUserGuest.setCity("Cluj");
        anotherUserGuest.setTelephone("123123123");
        anotherUserGuest.setZipCode("1233333333");
        anotherUserGuest.setSelectCountry(anotherUserGuest.getSelectCountry());
        anotherUserGuest.setSelectState(anotherUserGuest.getSelectState());

        checkoutSteps.fillRegisterDataInShippingInformation();

    }

    @Test
    public void testClickOnContinueButtonShippingInformation() {
        checkoutSteps.clickOnContinueButtonFromShippingInformation();
    }

    @Test
    public void checkoutTest() throws InterruptedException {

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

        //click checkout as guest
        checkoutSteps.clickCheckoutBtn();

        //billing information
        checkoutSteps.fillRegisterDataInBillingInfo();

        //click continue billing information
        checkoutSteps.clickOnContinueButtonFromBillingInformationCheckout();

        //shipping information
        checkoutSteps.fillRegisterDataInShippingInformation();

        checkoutSteps.clickOnContinueButtonFromShippingInformation();
        checkoutSteps.clickShippingMethod();

        checkoutSteps.clickPaymentInformation();
        checkoutSteps.clickOrderReview();


    }
}
