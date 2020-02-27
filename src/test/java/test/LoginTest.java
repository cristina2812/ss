package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HeaderSteps;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Steps
    HeaderSteps headerSteps;

    @Steps
    LoginSteps loginSteps;


    @Test
    public void loginTest(){
        headerSteps.clickLoginBtn();
        loginSteps.fillLoginData();
        loginSteps.clickOnLoginButton();


    }
}
