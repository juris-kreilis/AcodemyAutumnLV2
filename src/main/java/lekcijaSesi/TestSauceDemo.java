package lekcijaSesi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import lekcijaSesi.TestSauceDemoMethods;

public class TestSauceDemo extends TestSauceDemoMethods {
    private void loginTest(String email, String password) throws InterruptedException {
        driverSauce.get("https://www.saucedemo.com/v1");
        Thread.sleep(5000);

        WebElement loginEmailInput = driverSauce.findElement(By.id("user-name"));
        WebElement loginPasswordInput = driverSauce.findElement(By.id("password"));
        WebElement loginButton = driverSauce.findElement(By.id("login-button"));

        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        loginButton.click();

    }
    @Test
    public void loginEmptyPasswordFilled() throws InterruptedException {
        driverSauce.get("https://www.saucedemo.com/v1");
        Thread.sleep(5000);

        WebElement loginPasswordInput = driverSauce.findElement(By.id("password"));
        WebElement loginButton = driverSauce.findElement(By.id("login-button"));

        loginPasswordInput.sendKeys("secret_sauce");
        loginButton.click();
        Thread.sleep(5000);
        WebElement errorMessage = driverSauce.findElement(By.xpath("//*[@id='login_button_container']/div/form/h3"));
        Assert.assertEquals(errorMessage.getText(),"Epic sadface: Username is required","Wrong error message!!!");
        System.out.println("Error message is: " +errorMessage);
    }
    @Test
    public void loginFilledPasswordEmpty() throws InterruptedException {

        driverSauce.get("https://www.saucedemo.com/v1");
        WebElement loginEmailInput = driverSauce.findElement(By.id("user-name"));
        WebElement loginButton = driverSauce.findElement(By.id("login-button"));

        loginEmailInput.sendKeys("standard_user");
        loginButton.click();
        Thread.sleep(5000);
        WebElement errorMessageLoginFilled = driverSauce.findElement(By.xpath("//*[@id='login_button_container']/div/form/h3"));
        Assert.assertEquals(errorMessageLoginFilled.getText(), "Epic sadface: Password is required", "Wrong error message!!!");
        System.out.println("Error message is: " + errorMessageLoginFilled);

    }
    @Test
    public void credentialsEmpty() throws InterruptedException{
        driverSauce.get("https://www.saucedemo.com/v1/");
        WebElement loginButton = driverSauce.findElement(By.id("login-button"));
        Thread.sleep(5000);
        WebElement errorMessageAllEmpty = driverSauce.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessageAllEmpty.getText(), "Epic sadface: Username is required", "Wrong error message!!!");
        Thread.sleep(5000);
        System.out.println("Error message is: " + errorMessageAllEmpty);
    }
    @Test
    public void wrongCredentials() throws InterruptedException{

        driverSauce.get("https://www.saucedemo.com/v1/");
        WebElement loginEmailInput = driverSauce.findElement(By.id("user-name"));
        WebElement loginPasswordInput = driverSauce.findElement(By.id("password"));
        WebElement loginButton = driverSauce.findElement(By.id("login-button"));

        loginEmailInput.sendKeys("test123");
        loginPasswordInput.sendKeys("wrongtest");
        loginButton.click();
        Thread.sleep(5000);
        WebElement errorMessageAllWrong = driverSauce.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertEquals(errorMessageAllWrong.getText(), "Epic sadface: Username and password do not match any user in this service", "Wrong error message!!!");
        Thread.sleep(5000);
        System.out.println("Error message is: " + errorMessageAllWrong);
    }



}