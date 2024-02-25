package waits.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.BaseTest;

public class SeleniumPage extends BasePage {

    @FindBy(id="adder")
    public WebElement addABoxButton;

    @FindBy(id="reveal")
    public WebElement revealButton;

    @FindBy(id="box0")
    public WebElement box0;

    public SeleniumPage(WebDriver driver) {
        super(driver);
    }

    public void getBox(){
        waitForElementToAppear(box0);
        box0.click();
    }


//    WebElement addABoxButton = driver.findElement(By.id("adder"));
//    WebElement revealButton = driver.findElement(By.id("reveal"));
//        addABoxButton.click();
//
//        driver.findElement(By.id("box0"));
//
//
//        revealButton.click();
//    WebElement revealed = driver.findElement(By.id("revealed"));

}
