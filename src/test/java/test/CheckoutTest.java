package test;

import models.User;
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
    public void registerTest() {
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

        checkoutSteps.fillRegisterData(userGuest);

    }

    @Test
    public void testSelectDifferentShipAddress() {
        checkoutSteps.clickSelectShipToDifferentAddress();
    }

    @Test
    public void testClickOnContinueButtonBillingInformation() {
        checkoutSteps.clickOnContinueButtonFromBillingInformationCheckout();
    }
}
