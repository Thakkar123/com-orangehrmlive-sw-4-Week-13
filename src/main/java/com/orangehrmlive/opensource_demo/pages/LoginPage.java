package com.orangehrmlive.opensource_demo.pages;

import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

By userNameField = By.id("txtUsername");
By passwordField = By.id("txtPassword");
By loginButton = By.xpath("//input[@id='btnLogin']");
By welcomeText = By.id("welcome");
By forgotPasswordLink = By.linkText("Forgot your password?");
By forgotPasswordText = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

        public void enterUserName(String name)
        {
            sendTextToElement(userNameField,name);
        }

        public void enterPassword(String password)
        {
            sendTextToElement(passwordField,password);
        }

        public void clickOnLoginButton()
        {
            clickOnElement(loginButton);
        }

        public String getWelcomeText()
        {

            return getTextFromElement(welcomeText);
        }
        public void clickOnForgotPasswordLink()
        {
            clickOnElement(forgotPasswordLink);

        }
        public String getForgotPasswordText()
        {
            return getTextFromElement(forgotPasswordText);
        }

}
