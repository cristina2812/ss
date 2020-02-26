package test;

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



}
