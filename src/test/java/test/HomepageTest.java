package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.HomepagePage;
import steps.HomepageSteps;

@RunWith(SerenityRunner.class)
public class HomepageTest extends BaseTest{

    @Steps
    HomepageSteps homepageSteps;


    @Test
    public void clickOnNavBarCategoriesButtonsTest(){
        homepageSteps.checkIfCategoryButtonsRedirectsToTheCorrecttPage();

    }
}
