package com.bddsoftwaretestingboard.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class LoginPOM {

    //WebDriver instance
    WebDriver driver;

    //Locators for the login page
    private By usernameField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");
    private By loggedInUser = By.className("logged-in");

    //URL
    String URL = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";

    public LoginPOM(WebDriver driver) {
        this.driver = driver;
    }

    //Method to navigate to the login page
    public void navigateToLoginPage() {
        driver.get(URL);
        System.out.println("Navigated to login page...");
    }

    //Method to enter username
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        System.out.println("Entered username...");
    }

    //Method to enter password
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        System.out.println("Entered password...");
    }

    //Method to click the login button
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
        System.out.println("Clicked login button...");
    }

    //Method to confirm login
    public void confirmLogin() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElement(loggedInUser).isDisplayed()) {
            Assert.assertTrue(driver.findElement(loggedInUser).isDisplayed());
            System.out.println("Login successful...");
        } else {
            System.out.println("Login failed...");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }
}
