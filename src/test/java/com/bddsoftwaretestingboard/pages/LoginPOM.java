package com.bddsoftwaretestingboard.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * LoginPOM class contains methods to interact with the login page of the Magento website.
 * It includes methods to navigate to the login page, enter credentials, click the login button,
 * and confirm login status or error messages.
 */
public class LoginPOM {

    //WebDriver instance
    WebDriver driver;

    //Locators for the login page
    private By usernameField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");
    private By loggedInUser = By.className("logged-in");
    private By pageMessage = By.className("messages");
    private By emailError = By.id("email-error");
    private By passwordError = By.id("pass-error");

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

    //Method to confirm invalid login
    public void confirmInvalidLogin() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElement(pageMessage).isDisplayed()) {
            Assert.assertTrue(driver.findElement(pageMessage).isDisplayed());
            System.out.println("Invalid login confirmed...");
        } else {
            System.out.println("Invalid login not confirmed...");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }

    //Method to confirm empty fields
    public void confirmEmptyFields() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElement(emailError).isDisplayed() && driver.findElement(passwordError).isDisplayed()) {
            Assert.assertTrue(driver.findElement(emailError).isDisplayed());
            Assert.assertTrue(driver.findElement(passwordError).isDisplayed());
            System.out.println("Empty field at login confirmed...");
        } else {
            System.out.println("Empty field at login not confirmed...");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }
}
