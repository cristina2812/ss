package page;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class WishlistPage extends AbstractPage{
ProductsListPage productsListPage;
    @FindBy(css="li:nth-child(1) > div > div.actions > ul > li:nth-child(1) > a")
    private WebElementFacade addSpecificProductToWishlList;

    @FindBy(css=".success-msg")
    private WebElementFacade productInwishlistTitle;

    @FindBy(css=".cart-cell > button")
    private WebElementFacade rightSideAddToCartButton;

    @FindBy(css = "ul#configurable_swatch_color li")
    private List<WebElementFacade> colorList;

    @FindBy(css = "ul#configurable_swatch_size li")
    private List<WebElementFacade> customSize;

    @FindBy(css=".btn-remove2")
    private WebElementFacade deleteProducFromWishlistButton;

    public String addtoWishlistButton(){
        WebElement randomProduct = productsListPage.getRandomProductContainer();
        String productName = randomProduct.findElement(By.cssSelector("div > h2")).getText();
        randomProduct.findElement(By.cssSelector(".link-wishlist")).click();
        return productName;
    }

    public String checkIsProductIsInList(){
        return productInwishlistTitle.getText();
    }

    public void addToCartButton(){
        rightSideAddToCartButton.click();
    }


    public void deleteProductButton(){
        deleteProducFromWishlistButton.click();
    }

}
