package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.RegisterSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/RegisterUsers.csv")
public class RegisterTestDDT extends BaseTest{

    @Managed(uniqueSession = true)
    private WebDriver webDriver;

    @Steps
    private RegisterSteps registerSteps;

    private String firstName, lastName, email, password;

    @Test
    public void registerStepsDTTTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.fillRegisterDataFromCSV(firstName, lastName, email, password, password);
        registerSteps.verifyUserIsRegistered(firstName, lastName);
    }
}
