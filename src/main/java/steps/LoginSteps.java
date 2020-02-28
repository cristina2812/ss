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
    public void loginSuccess(){

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
    public void messagePassworOrEmailInvalid(String resultDefinition){

        resultDefinition = "Invalid login or password.";
        String messageInvalid = loginPage.getGreetMessage();
        Assert.assertEquals(resultDefinition, messageInvalid);
    }

    @Step
    public void messageLoginSuccess(){
        String messageSuccess = loginPage.loginSuccessMessage();
        Assert.assertTrue(messageSuccess.contains("WELCOME"));

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

    String emailAddress, password, resultDefinition;

    @Step
    public void onlyStepsmethod(){

        loginPage.typeEmailAddress(emailAddress);
        loginPage.typePassword(password);
        loginPage.clickLoginButton();
        resultDefinition = "Invalid login or password.";
        if(resultDefinition == "Invalid login or password."){
            headerPage.clickOnAccountDropdown();
            loginPage.clicklogout();
            headerPage.clickOnAccountDropdown();
            loginPage.clicklogout();
        }else {
            String messageInvalid = loginPage.getGreetMessage();
            Assert.assertEquals(resultDefinition, messageInvalid);
        }

    }
}
