package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import page.HeaderPage;
import page.WishlistPage;
import org.junit.Assert;

public class WishlistSteps {


    @Steps
    LoginSteps loginSteps;
    @Steps
    HeaderSteps headerSteps;

    HeaderPage headerPage;
    WishlistPage wishlistPage;


    @Step
    public void loginAndSelectProduct(){
        headerSteps.clickLoginBtn();
        loginSteps.fillLoginData();
        loginSteps.clickOnLoginButton();
        headerPage.clickMenSubcategory();
        wishlistPage.addtoWishlistButton();
        Assert.assertTrue(wishlistPage.checkIsProductIsInList().toLowerCase().contains("Plaid Cotton Shirt".toLowerCase()));

    }
}
