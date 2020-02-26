package steps;


import net.thucydides.core.annotations.Step;
import page.ProductPage;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.HeaderPage;
import page.ProductsListPage;

public class ProductSteps {
    ProductPage productPage;

    @Step
    public void getColor() {
        System.out.println(productPage.getColorListSize());
    }
    HeaderPage headerPage;
    ProductsListPage productsListPage;

    @Step
    public void insertKeywordInSearchField(String key) {
        headerPage.changeFieldSearch(key);
        headerPage.clickSearchBtn();
    }
    @Step
    public void selectASimpleProduct(){
            productsListPage.clickOnSimpleProductPage();
    }
}
