package test;

import models.Product;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import steps.FooterSteps;



@RunWith(SerenityRunner.class)
public class FooterTest extends BaseTest {

    @Steps
    FooterSteps footerSteps;

    @Test
    public void testSearchAvailableProduct() {

        footerSteps.clickOnFooterLink("Advanced Search");

        Product product = new Product();

        product.setName(product.getName());
        product.setDescription(product.getDescription());
        product.setPriceFrom(product.getPriceFrom());
        product.setPriceTo(product.getPriceTo());
        product.setSelectColour(product.getSelectColour());
        product.setSelectSize(product.getSelectSize());
        product.setSelectGender(product.getSelectGender());

        footerSteps.fillAdvancedSearchFields();

       footerSteps.searchButton();

       // footerSteps.verifyIfResultsAreDisplayed();

        footerSteps.verifyListResultsDisplayed();

    }

    // This is a negative test

    @Test
    public void testSearchForUnavailableProduct() {

        footerSteps.clickOnFooterLink("Advanced Search");

        Product unavailableProduct = new Product();

        unavailableProduct.setName(unavailableProduct.getName());
        unavailableProduct.setDescription(unavailableProduct.getDescription());
        unavailableProduct.setPriceFrom(unavailableProduct.getPriceFrom());
        unavailableProduct.setPriceTo(unavailableProduct.getPriceTo());
        unavailableProduct.setSelectColour(unavailableProduct.getSelectColour());
        unavailableProduct.setSelectSize(unavailableProduct.getSelectSize());
        unavailableProduct.setSelectGender(unavailableProduct.getSelectGender());

        footerSteps.fillAdvancedSearchFieldsUnavailableProduct();

        footerSteps.searchButton();

        footerSteps.verifyNoReturnResult();

        footerSteps.clickOnModifySearch();
    }


}
