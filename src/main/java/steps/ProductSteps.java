package steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import page.ProductPage;
import org.junit.Assert;
import page.HeaderPage;
import page.ProductsListPage;

public class ProductSteps {
    ProductPage productPage;
    HeaderPage headerPage;
    ProductsListPage productsListPage;


    @Step
    public void selectCustomProduct() {
        productsListPage.clickOnRandomProductFromList();
    }


    @Step
    public void getProperties() {
        System.out.println(productPage.getColorListSize());
        productPage.getRandomProperties();
    }


    @Step
    public void insertKeywordInSearchField(String key) {
        headerPage.changeFieldSearch(key);
        headerPage.clickSearchBtn();
    }

    @Step
    public void clickAddToCart() {
        productPage.addToCart();
    }

    @Step
    public void clickOnSimpleProductPage() {
        productsListPage.clickOnRandomProductFromList();
    }

    @Step
    public String returnProductName() {
        Assert.assertTrue(productPage.getProductName()!=null);
        String name = productPage.getProductName();
        return name;
    }

//    @Step
//    public String getProductPrice() {
//
//    }
}
