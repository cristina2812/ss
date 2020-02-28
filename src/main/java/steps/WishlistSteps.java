package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import page.HeaderPage;
import page.ProductPage;
import page.WishlistPage;
import org.junit.Assert;

public class WishlistSteps {


    @Steps
    LoginSteps loginSteps;
    @Steps
    HeaderSteps headerSteps;

    HeaderPage headerPage;
    WishlistPage wishlistPage;
    ProductPage productPage;


    @Step
    public void loginOnSiteStep(){
        headerSteps.clickLoginBtn();
        loginSteps.fillLoginData();
        loginSteps.clickOnLoginButton();
    }

    @Step
    public String selectRandomProduct(){
        headerPage.clickMenSubcategory();
      return  wishlistPage.addtoWishlistButton();
    }

    @Step
    public void checkIfProductWasAddedInWishlist(String productInPageTitle){
        Assert.assertTrue(wishlistPage.checkIsProductIsInList().toLowerCase().contains(productInPageTitle.toLowerCase()));

    }

    @Step
    public void addProductInWishlistCart(){
        wishlistPage.addToCartButton();
        productPage.getRandomProperties();
        productPage.addToCart();
    }

    @Step
    public void deleteProductFromWishlist(){
        wishlistPage.deleteProductButton();
    }







}
