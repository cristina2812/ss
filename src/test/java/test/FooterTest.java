package test;

import models.Product;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.FooterPage;
import steps.FooterSteps;

@RunWith(SerenityRunner.class)
public class FooterTest extends BaseTest {

    @Steps
    FooterSteps footerSteps;



    @Test
    public void testAdvancedSearch() {

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

        footerSteps.seachButton();

        footerSteps.verifyIfResultsAreDisplayed();


    }
}
