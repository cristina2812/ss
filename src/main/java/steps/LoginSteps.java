package steps;

import factory.UserFactory;
import models.LoginUser;
import net.thucydides.core.annotations.Step;
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
}
