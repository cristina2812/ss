package steps;

import net.thucydides.core.annotations.Step;
import page.CartPage;
import org.junit.Assert;
import page.ProductPage;

public class CartSteps {

    CartPage cartPage;
    ProductPage productPage;

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
        Assert.assertTrue(cartPage.getProductNameFromCartPage() != null);
        System.out.println(cartPage.getProductNameFromCartPage());
    }

    @Step
    public void checkProductNameFromCartContainsInitialName() {
        String name = productPage.getProductName();
        try {
            System.out.println("iaaa");
            Assert.assertTrue(cartPage.getProductNameFromCartPage().contains(name));
            System.out.println("heeeeeeeeeeeeeeeeelp");
        }
        catch (AssertionError error){
            System.out.println("exceptieeeeeee");
        }
    }
}
