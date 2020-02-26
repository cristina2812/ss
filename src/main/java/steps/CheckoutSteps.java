package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.CheckoutPage;

public class CheckoutSteps {

    CheckoutPage checkoutPage;

    @Step
    public void clickCheckoutBtn() {
        checkoutPage.clickCheckOutAsGuestButton();

    }

  

}
