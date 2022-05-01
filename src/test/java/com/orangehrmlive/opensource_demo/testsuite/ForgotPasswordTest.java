package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    LoginPage loginpage = new LoginPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginpage.clickOnForgotPasswordLink();
        String actualMessage = loginpage.getForgotPasswordText();
        Assert.assertEquals(actualMessage,"Forgot Your Password?","error");
    }

}
