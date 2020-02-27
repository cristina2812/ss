package page;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class WishlistPage extends AbstractPage{

    @FindBy(css="li:nth-child(1) > div > div.actions > ul > li:nth-child(1) > a")
    private WebElementFacade addSpecificProductToWishlList;
    @FindBy(css=".success-msg")
    private WebElementFacade productInwishlistTitle;


    public void addtoWishlistButton(){
        addSpecificProductToWishlList.click();
    }

    public String checkIsProductIsInList(){
        return productInwishlistTitle.getText();
    }
}
