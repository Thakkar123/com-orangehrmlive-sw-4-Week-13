package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

LoginPage loginpage = new LoginPage();

@Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickOnLoginButton();
        String actualMessage = loginpage.getWelcomeText();
        Assert.assertEquals(actualMessage,"Welcome","error");
    }


}
