package lekcijaSesi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import lekcijaSesi.pageObjects.QAProjectLoginPage;

public class MansOtraisSeleniumTests extends BaseTest{


    private void attemptToLogin(String email, String password){
        driver.get("https://qaproject.acodemy.lv/login");

        WebElement loginEmailInput = driver.findElement(By.id("email"));
        WebElement loginEmailInputWithXpath = driver.findElement(By.xpath("//input[@id='email']"));


        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("btn-primary"));

        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        loginButton.click();
    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        attemptToLogin("emilysinclair@gmail.com","qwerty123456#");

        WebElement nameDropDown = driver.findElement(By.id("navbarDropdown"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qaproject.acodemy.lv/home","User is not navigated to home URL");
        Assert.assertEquals(nameDropDown.getText(),"Emily","Wrong username visible in header dropdown");
    }

    @Test
    public void wrongCredentialsLoginTest() throws InterruptedException {
        attemptToLogin("emilysinas1231dasdr@gmail.com","asdas#");

        WebElement emailFieldErrorMessage = driver.findElement(By.className("invalid-feedback"));
        Assert.assertEquals(emailFieldErrorMessage.getText(),"These credentials do not match our records.","Wrong credential message");
    }

    @Test
    public void emptyEmailLoginFieldTest(){
        attemptToLogin("","asdasdasdsa");
    }

    @Test
    public void emptyPasswordLoginFieldTest(){
        attemptToLogin("asdasda@asdas.com","");
    }


}
