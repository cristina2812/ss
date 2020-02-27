package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class HomepagePage extends AbstractPage {

    @FindBy(css=".level0.nav-1")
    private WebElementFacade clickOnWomenButtonFromNavBar;

    @FindBy(css=".level0.nav-2")
    private WebElementFacade clickOnMenButtonFromNavBar;

    @FindBy(css=".level0.nav-3")
    private WebElementFacade clickOAccesoriesButtonFromNavBar;

    @FindBy(css=".level0.nav-4")
    private WebElementFacade clickOnHomeDecourButtonFromNavBar;

    @FindBy(css=".level0.nav-5")
    private WebElementFacade clickOnSaleButtonFromNavBar;

    @FindBy(css=".level0.nav-6")
    private WebElementFacade clickOnVIPButtonFromNavBar;


    @FindBy(css=".page-title category-title")
    private WebElementFacade categoryTitle;

    public void clickButtonsFromNavBar(){
        clickOnWomenButtonFromNavBar.click();

    }
    public String getCategorytitle(){
        return categoryTitle.getText().toLowerCase();
    }

}
