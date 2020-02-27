package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class CartPage extends AbstractPage {

    @FindBy(css = "#header > div > div.skip-links > div > div > a")
    private WebElementFacade cartIcon;

    @FindBy(css = ".minicart-wrapper")
    private WebElementFacade cartWrapper;

    @FindBy(css = "#header-cart > div.minicart-wrapper > p.empty")
    private WebElementFacade cartWrapperMessage;

    @FindBy(css = "page-title title-buttons")
    private WebElementFacade cartPageTitle;

    @FindBy(css = ".success-msg > ul > li > span")
    private WebElementFacade productNameFromCartPage;

    public void clickOnCartIcon() {
        cartIcon.click();
    }

    public boolean getCartWrapper() {
        return cartWrapper.isDisplayed();
    }

    public String getCartWrapperMessageForZeroProducts() {
        return cartWrapperMessage.getText();
    }

    public String getCartPageTitle() {
        return  cartPageTitle.getText();
    }

    public String getProductNameFromCartPage() {
        waitFor(productNameFromCartPage);
        return productNameFromCartPage.getText().toUpperCase();
    }

}
