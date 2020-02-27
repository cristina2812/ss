package factory;

import models.LoginUser;
import models.UserGuest;

public class UserFactory {

    public UserGuest getUser(){
        UserGuest userGuest = new UserGuest();
        userGuest.setFirstName("Ionel");
        userGuest.setLastName("Maria");
        userGuest.setAddress("Strada Cafelei");
        userGuest.setEmail("ionel@gmail.com");
        userGuest.setCity("Cluj");
        userGuest.setTelephone("123123123");
        userGuest.setZipCode("1233333333");
        userGuest.setSelectCountry("RO");
        userGuest.setSelectState("Cluj");
        return userGuest;
    }

    public LoginUser loginUser(){
        LoginUser loginUser = new LoginUser();
        loginUser.setEmailAddress("cristina_adam97@yahoo.com");
        loginUser.setPassword("123456");

        return loginUser;
    }

    public LoginUser emailAddressUser(){
        LoginUser loginUser = new LoginUser();
        loginUser.setEmailAddress("cristina_adam97@yahoo.com");

        return loginUser;
    }
}
