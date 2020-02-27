package steps;

import factory.ProductFactory;
import models.Product;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import page.FooterPage;

import java.time.Duration;

public class FooterSteps {

    FooterPage footerPage;

    @Step
    public void fillAdvancedSearchFields() {

        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.getProduct();

        footerPage.typeProductName(product.getName());
        footerPage.typeProductDescription(product.getDescription());
        footerPage.typePriceTo(product.getPriceTo());
        footerPage.typePriceFrom(product.getPriceFrom());
        footerPage.selectProductColour(product.getSelectColour());
        footerPage.selectProductSize(product.getSelectSize());
        footerPage.selectGender(product.getSelectGender());
    }

    @Step
    public void fillAdvancedSearchFieldsUnavailableProduct() {

        ProductFactory productFactory = new ProductFactory();
        Product unavailableProduct = productFactory.getUnavailableProduct();

        footerPage.typeProductName(unavailableProduct.getName());
        footerPage.typeProductDescription(unavailableProduct.getDescription());
        footerPage.typePriceTo(unavailableProduct.getPriceTo());
        footerPage.typePriceFrom(unavailableProduct.getPriceFrom());
        footerPage.selectProductColour(unavailableProduct.getSelectColour());
        footerPage.selectProductSize(unavailableProduct.getSelectSize());
        footerPage.selectGender(unavailableProduct.getSelectGender());
    }

    @Step
    public void searchButton() {
        footerPage.clickOnSearchButton();
    }

    @Step
    public void enterButton() {
        footerPage.enterOnSearch();
    }

    @Step
    public void clickOnFooterLink(String text){
        footerPage.getLinkWithText(text).click();
    }

    @Step
    public void searchResults() {
       footerPage.isSearchResultsVisibile();
    }

    // Verify if any result is displayed

    @Step
    public void verifyIfResultsAreDisplayed() {
        Assert.assertTrue(footerPage.isSearchResultsVisibile());
    }

    // Verify if a list with results is displayed

    @Step
    public void verifyListResultsDisplayed() {
        Assert.assertTrue(footerPage.isListOfResultsDisplayed());
    }

    @Step
    public void verifyNoReturnResult() {
        Assert.assertTrue(footerPage.isNoResultDisplayed());
    }

    @Step
    public void clickOnModifySearch() {
        footerPage.clickModifySearch();
    }


}
