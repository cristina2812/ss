package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import page.ProductsListPage;

public class ProductsListSteps {
    public ProductsListPage productsListPage;
    @Steps
    HeaderSteps headerSteps;

    @Step
    public void checkIfProductIsPresentOrNot(String productName, boolean shouldBePresent){

        if(shouldBePresent){
            Assert.assertTrue(productsListPage.isProductPresent(productName));
        }
        else{
            Assert.assertFalse(productsListPage.isProductPresent(productName));
        }
    }


    public String searchKeyword, searchResult;
    public boolean shouldBeFound;

    @Step
    public void fillAndSearchWithResults() {
        headerSteps.insertKeywordInSearchFieldDDT(searchKeyword);
        checkIfProductIsPresentOrNot(searchResult, shouldBeFound);
    }
}
