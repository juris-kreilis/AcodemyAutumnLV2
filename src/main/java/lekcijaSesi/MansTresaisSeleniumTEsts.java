package lekcijaSesi;

import org.testng.Assert;
import org.testng.annotations.Test;
import lekcijaSesi.pageObjects.HomePage;
import lekcijaSesi.pageObjects.QAProjectLoginPage;

public class MansTresaisSeleniumTEsts extends BaseTest {

    QAProjectLoginPage qaProjectLoginPage;

    @Test
    public void testWithPageObjects() {
        driver.get("https://qaproject.acodemy.lv/login");
        qaProjectLoginPage = new QAProjectLoginPage(driver);
        qaProjectLoginPage.login("test@asdsa.com","test");
        Assert.assertEquals(qaProjectLoginPage.getErrorMessage(),"These credentials do not match our records.");
    }

    @Test
    public void testWithPageObjects2() {
        driver.get("https://qaproject.acodemy.lv/login");
        qaProjectLoginPage = new QAProjectLoginPage(driver);
        qaProjectLoginPage.login("test@ac.com","");
        Assert.assertEquals(qaProjectLoginPage.getValidationErrorMessage(qaProjectLoginPage.passwordInput),"Please fill in this field."); ;
    }

    @Test
    public void testWithPageObjects3() {
        driver.get("https://qaproject.acodemy.lv/login");
        qaProjectLoginPage = new QAProjectLoginPage(driver);
        qaProjectLoginPage.login("","asdas");
        Assert.assertEquals(qaProjectLoginPage.getValidationErrorMessage(qaProjectLoginPage.emailInput),"Please fill in this field."); ;
    }


    @Test
    public void testWithPageObjects4() {
        driver.get("https://qaproject.acodemy.lv/login");
        qaProjectLoginPage = new QAProjectLoginPage(driver);
        String username = "asdas";
        qaProjectLoginPage.login(username,"asdas");
        Assert.assertEquals(qaProjectLoginPage.getValidationErrorMessage(qaProjectLoginPage.emailInput),
                String.format("Please include an '@' in the email address. '%s' is missing an '@'.",username));
    }

    @Test
    public void testSuccessfulLogin(){
        driver.get("https://qaproject.acodemy.lv/login");
        qaProjectLoginPage = new QAProjectLoginPage(driver);
        HomePage homepage = qaProjectLoginPage.login("emilysinclair@gmail.com", "qwerty123456#");
        Assert.assertEquals(homepage.getWelcomeMessage(),"Welcome, Sinclair! You are logged in!");
    }

}
