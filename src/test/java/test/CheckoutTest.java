package test;

import models.UserGuest;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.CheckoutSteps;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest {

    CheckoutSteps checkoutSteps;

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

        checkoutSteps.fillRegisterDataInBillingInfo(userGuest);

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

        checkoutSteps.fillRegisterDataInShippingInformation(anotherUserGuest);

    }

    @Test
    public void testClickOnContinueButtonShippingInformation() {
        checkoutSteps.clickOnContinueButtonFromShippingInformation();
    }
}
