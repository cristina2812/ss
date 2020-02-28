package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HeaderSteps;
import steps.LoginSteps;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "D:/Echipa1/src/test/resources/csv/" + "LoginUsers.csv")
public class LoginTestDDT extends BaseTest{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    HeaderSteps headerSteps;

    @Steps
    LoginSteps loginSteps;

    private String emailAddress,password,resultDefinition;

    @Test
    public void loginInvalidEmailOrPassTest(){
        headerSteps.clickLoginBtn();
        loginSteps.fillEmailAddressData(emailAddress);
        loginSteps.fillPasswordData(password);
        loginSteps.clickOnLoginButton();
        loginSteps.messagePassworOrEmailInvalid(resultDefinition);
    }



}
