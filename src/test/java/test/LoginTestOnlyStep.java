package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HeaderSteps;
import steps.LoginSteps;
import utils.Constants;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class LoginTestOnlyStep extends BaseTest{

    @Managed(uniqueSession = true)
    private WebDriver webdriver;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    LoginSteps loginSteps;

    private String emailAddress,password,resultDefinition;

    @Test
    public void loginInvalidEmailOrPassTest() throws IOException {
        headerSteps.clickLoginBtn();

        withTestDataFrom(Constants.CSV_FILES_PATH + "LoginUsers.csv").run(loginSteps).onlyStepsmethod();
    }

}
