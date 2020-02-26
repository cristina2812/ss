package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HeaderSteps;
import steps.ProductSteps;

@RunWith(SerenityRunner.class)
public class ProductTest extends BaseTest {
    @Steps
    HeaderSteps headerSteps;
    ProductSteps productSteps;

    @Test
    public void searchSimpleProduct() {
        headerSteps.insertKeywordInSearchField("glass");
    }

//    @Test
//    public void getColorProperty() {
//        productSteps.getColor();
//    }


}
