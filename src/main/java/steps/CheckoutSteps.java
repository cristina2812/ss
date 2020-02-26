package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.CheckoutPage;

public class CheckoutSteps {

    CheckoutPage checkoutPage;

    @Step
    public void clickCheckoutBtn() {
        checkoutPage.clickCheckOutAsGuestButton();

    }

    @Step
    public void clickShippingMethod(){
        checkoutPage.clickRadioButtonFreeShipping();
        checkoutPage.clickContinueShippingMethod();
    }

    @Step
    public void clickPaymentInformation(){
        checkoutPage.clickContinuePaymentInformation();
    }

    @Step
    public void clickOrderReview(){
        checkoutPage.clickPlaceOrder();
    }

}
