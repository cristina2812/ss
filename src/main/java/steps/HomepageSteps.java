package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import page.HomepagePage;
import org.junit.Assert;

public class HomepageSteps {

    HomepagePage homepagePage;

    @Step
    public void checkIfCategoryButtonsRedirectsToTheCorrecttPage(){

        homepagePage.clickButtonsFromNavBar();
    }

}
