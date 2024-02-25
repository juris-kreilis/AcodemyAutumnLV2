package lekcijaSesi;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import lekcijaSesi.pageObjects1a.OneALandingPage;

public class BrowserNavigation extends BaseTest {
    @Test
    public void testBrowserNavigation() throws InterruptedException {
        driver.get("https://www.1a.lv/");

        WebElement smartNetBanner = driver.findElement(By.className("smart-net-banner__info-button-text"));
        smartNetBanner.click();

        List<WebElement> listOnInputFields = driver.findElements(By.className("users-session-form__input--text"));

        for (WebElement listOnInputField : listOnInputFields) {
            listOnInputField.sendKeys("Juris");
        }


        //back
        driver.navigate().back();

        //forward
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

        Thread.sleep(6000);
    }

    @Test
    public void testAcceptCookiesIn1a() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        WebElement acceptAllCookiesButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        WebElement cookieBanner = driver.findElement(By.id("cookiebanner"));
        Assert.assertTrue(cookieBanner.isDisplayed(),"Cookie banner is not displayed");

        System.out.println(cookieBanner.getTagName());
        Assert.assertEquals(cookieBanner.getCssValue("display"),"block");

        acceptAllCookiesButton.click();

        Assert.assertFalse(cookieBanner.isDisplayed(),"Cookie banner is displayed");
        Assert.assertEquals(cookieBanner.getCssValue("display"),"none");

        List<WebElement> cookiebanners = driver.findElements(By.id("cookiebanner"));
        Assert.assertEquals(cookiebanners.size(),0);

        Thread.sleep(6000);
    }

    @Test
    public void test220cookies(){
        driver.get("https://220.lv/lv/");
        WebElement cookieBlock = driver.findElement(By.className("cookies_wrapper"));
        Assert.assertTrue(cookieBlock.isDisplayed(),"Cookie block is not displayed");

        driver.findElement(By.xpath("//div[@class='cookies_wrapper']//button[@widget-attachpoint='agree']")).click();

        Assert.assertFalse(cookieBlock.isDisplayed(),"Cookie block is  displayed");


    }

    @Test
    public void testAttributeIn1a() throws InterruptedException {
        driver.get("https://www.1a.lv/");
        OneALandingPage oneALandingPage = new OneALandingPage(driver);

        List<WebElement> languageElements = driver.findElements(By.xpath("//li[contains(@class,'language-switcher')]/a"));

        Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"lv");
//        oneALandingPage.switchLanguage("RU");
        languageElements.get(1).click();
        Thread.sleep(5000);
        Assert.assertEquals(oneALandingPage.cookieBanner.getAttribute("lang"),"ru");


    }

    @Test
    public void testKeyboardActions() throws InterruptedException {
        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/");

        new Actions(driver)
                .keyDown(Keys.COMMAND)
                .sendKeys("K")
                .perform();

        Thread.sleep(5000);

        new Actions(driver)
                .sendKeys(Keys.ESCAPE)
                .perform();

        Thread.sleep(5000);
    }

}
