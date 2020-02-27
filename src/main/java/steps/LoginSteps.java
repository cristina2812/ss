package steps;

import factory.UserFactory;
import models.LoginUser;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

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

}
