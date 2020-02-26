package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.dev.evozon.com/checkout/onepage/")
public class CheckoutPage extends AbstractPage {

    @FindBy (css = "#onepage-guest-register-button")
    private WebElementFacade checkOutAsGuestButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingMethodradioBtn;

    @FindBy(css = "#shipping-method-buttons-container .button")
    private WebElementFacade continueShippingMethodBtn;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentInformationBtn;

    @FindBy(css = "#review-buttons-container .button")
    private WebElementFacade placeOrderBtn;



    public void clickCheckOutAsGuestButton() {
        checkOutAsGuestButton.click();
    }

    public void clickRadioButtonFreeShipping(){
        freeShippingMethodradioBtn.click();
    }

    public void clickContinueShippingMethod(){
        continueShippingMethodBtn.click();
    }
    public void clickContinuePaymentInformation(){
        paymentInformationBtn.click();
    }

    public void clickPlaceOrder(){
        placeOrderBtn.click();
    }
}
