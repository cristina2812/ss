package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.ProductsListPage;

public class ProductsListSteps {
    public ProductsListPage productsListPage;
    @Step
    public void checkIfProductIsPresentOrNot(String productName, boolean shouldBePresent){

        if(shouldBePresent){
            Assert.assertTrue(productsListPage.isProductPresent(productName));
        }
        else{
            Assert.assertFalse(productsListPage.isProductPresent(productName));
        }

    }
}
