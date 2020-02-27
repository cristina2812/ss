package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("http://qa2.dev.evozon.com")
public class FooterPage extends AbstractPage {

    @FindBy (id = "name")
    private WebElementFacade productNameField;

    @FindBy (id = "description")
    private WebElementFacade productDescriptionField;

    @FindBy (name = "price[from]")
    private WebElementFacade priceFromField;

    @FindBy (name = "price[to]")
    private WebElementFacade priceToField;

    @FindBy (name = "color[]")
    private WebElementFacade colourList;

    @FindBy (name = "size[]")
    private WebElementFacade sizeList;

    @FindBy (name = "gender[]")
    private WebElementFacade genderList;

   @FindBy (css = ".buttons-set > button > span > span")
    private WebElementFacade searchButton;

   @FindBy (css = ".products-grid.products-grid--max-4-col.first.last.odd")
   private WebElementFacade advancedSearchResults;

   public void clickOnSearchButton() {
       searchButton.click();
   }

   public void typeProductName(String productName) {
       productNameField.type(productName);
   }

   public void typeProductDescription(String productDescription) {
       productDescriptionField.type(productDescription);
   }

   public void typePriceFrom(String priceFrom){
       priceFromField.type(priceFrom);
   }

    public void typePriceTo(String priceTo){
        priceToField.type(priceTo);
    }

    public void selectProductColour(String colour) {
        colourList.selectByVisibleText(colour);
    }

    public void selectProductSize(String size) {
        sizeList.selectByVisibleText(size);
    }

    public void selectGender(String gender) {
        genderList.selectByVisibleText(gender);
    }

    public boolean isSearchResultsVisibile(){
      return advancedSearchResults.isDisplayed();
    }




}
