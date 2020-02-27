package steps;

import net.thucydides.core.annotations.Step;
import page.CartPage;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage;


    @Step
    public void clickOnCart() {
        cartPage.clickOnCartIcon();
    }

    @Step
    public void checkCartWrapperExist() {
        Assert.assertTrue(cartPage.getCartWrapper());
    }

    @Step
    public void checkCartWrapperMessage(String message) {
        Assert.assertTrue(cartPage.getCartWrapperMessageForZeroProducts().contains(message));
    }

    @Step
    public void checkCartPageTitle(String title) {
        Assert.assertTrue(cartPage.getCartPageTitle().contains(title));
    }

    @Step
    public void checkProductNameFromCartPage() {
        Assert.assertTrue(cartPage.getCartProductName() != null);
    }

    @Step
    public void checkProductNameFromCartContainsInitialName(String name) {
        String actualName = cartPage.getCartProductName();
        Assert.assertTrue(actualName.toLowerCase().contains(name.toLowerCase()));
    }
}
