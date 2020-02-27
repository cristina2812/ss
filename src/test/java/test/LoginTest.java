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
    public void loginValidEmailAndPasswordTest(){
        headerSteps.clickLoginBtn();
        loginSteps.fillLoginData();
        loginSteps.clickOnLoginButton();

    }

    @Test
    public void loginInvalidPasswordAndValidEmailTest(){
        headerSteps.clickLoginBtn();
        loginSteps.fillEmailAddressData("cristina_adam97@yahoo.com");
        loginSteps.fillPasswordData("12345678");
        loginSteps.clickOnLoginButton();
        loginSteps.messagePassworOrEmailInvalid();
    }

    @Test
    public void loginInvalidPasswordAndInvaliddEmailTest(){
        headerSteps.clickLoginBtn();
        loginSteps.fillEmailAddressData("cristina9723@yahoo.com");
        loginSteps.fillPasswordData("12345678");
        loginSteps.clickOnLoginButton();
        loginSteps.messagePassworOrEmailInvalid();
    }

    @Test
    public void  forgotPasswordTest(){
        headerSteps.clickLoginBtn();
        loginSteps.forgotPassword();
        loginSteps.fillEmailAddressForgotPass("cristina_adam97@yahoo.com");
        loginSteps.clickSubmitForgotPass();
        loginSteps.messageSuccessForgotPass();
    }

    @Test
    public void checkLogOutBtnTest(){
        headerSteps.clickLoginBtn();
        loginSteps.fillLoginData();
        loginSteps.clickOnLoginButton();
        loginSteps.clickLogoutBtn();
        loginSteps.messageLogoutSuccess();
    }




}
