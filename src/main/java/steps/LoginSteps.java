package steps;

import factory.UserFactory;
import models.LoginUser;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.HeaderPage;
import page.LoginPage;

public class LoginSteps {

    LoginPage loginPage;
    HeaderPage headerPage;

    @Step
    public void clickOnLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void clickOnForgotPass(){
        loginPage.clickForgotYourPass();
    }

    @Step
    public void fillLoginData(){
        UserFactory userFactory = new UserFactory();
        LoginUser loginUser = userFactory.loginUser();

        loginPage.typeEmailAddress(loginUser.getEmailAddress());
        loginPage.typePassword(loginUser.getPassword());
    }

    @Step
    public void fillEmailAddressData(String emailAddress){
        loginPage.typeEmailAddress(emailAddress);
    }

    @Step
    public void  fillPasswordData(String password){
        loginPage.typePassword(password);
    }

    @Step
    public void messagePassworOrEmailInvalid(){

        String messageInvalid = loginPage.getGreetMessage();
        Assert.assertEquals("Invalid login or password.", messageInvalid);
    }
    @Step
    public void messageSuccessForgotPass(){

        String messageSuccess = loginPage.getMessageSuccessForgotPass();
        Assert.assertTrue(messageSuccess.contains(" you will receive an email"));
    }

    @Step
    public void messageLogoutSuccess(){

        String messageLogoutSuccess = loginPage.getLogoutMessage();
        Assert.assertEquals("YOU ARE NOW LOGGED OUT", messageLogoutSuccess);
    }


    @Step
    public void forgotPassword(){

        loginPage.forgotPassword();
    }

    @Step
    public void fillEmailAddressForgotPass(String email){
        loginPage.typeEmailAddressForgotPassword(email);
    }

    @Step
    public void clickSubmitForgotPass(){
        loginPage.submitForgotPass();
    }

    @Step
    public void clickLogoutBtn(){
        headerPage.clickOnAccountDropdown();
        loginPage.clicklogout();
    }
}
