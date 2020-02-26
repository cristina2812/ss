package test;

import models.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest {

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void registerTest(){

        User user = new User();
        user.setFirstName("Ion1");
        user.setLastName("Maria1");
        user.setEmail("ion1@email.com");
        user.setPass("dummyy1");
        user.setConfirmPass("dummyy1");

        registerSteps.navigateToRegisterPage();
        registerSteps.registerUser(user);
        registerSteps.verifyUserIsRegistered("Ion1", "Maria1");
    }
}
