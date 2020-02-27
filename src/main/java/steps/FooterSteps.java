package steps;

import factory.ProductFactory;
import models.Product;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.FooterPage;

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
    public void seachButton() {
        footerPage.clickOnSearchButton();
    }

    @Step
    public void clickOnFooterLink(String text){
        footerPage.getLinkWithText(text).click();
    }

    @Step
    public void searchResults() {
       footerPage.isSearchResultsVisibile();
    }

    @Step
    public void verifyIfResultsAreDisplayed() {
        Assert.assertTrue(footerPage.isSearchResultsVisibile());
    }

}
