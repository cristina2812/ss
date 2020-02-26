package steps;


import net.thucydides.core.annotations.Step;
import page.ProductPage;

public class ProductSteps {
    ProductPage productPage;

    @Step
    public void selectProduct() {
        productPage.selectSpecificProduct();
    }

    @Step
    public void getProperties() {
        System.out.println(productPage.getColorListSize());
        productPage.getRandomProperties();
    }


}
