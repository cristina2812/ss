package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.HeaderPage;
import steps.HeaderSteps;
import steps.LoginSteps;
import steps.WishlistSteps;

@RunWith(SerenityRunner.class)
public class WishlistTest extends BaseTest{

    @Steps
    WishlistSteps wishlistSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    HeaderSteps headerSteps;
    @Steps
    HeaderPage headerPage;

    @Test
    public void addProductToWishlist() {
        wishlistSteps.loginAndSelectProduct();
    }

}
