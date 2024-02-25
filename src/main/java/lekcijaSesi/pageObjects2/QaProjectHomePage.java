package lekcijaSesi.pageObjects2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaProjectHomePage {
    WebDriver driver;

    @FindBy(id="navbarDropdown")
    public WebElement menuDropDown;


    @FindBy(xpath=" //div[@class='card-header' and text()='Dashboard']/following-sibling::div[@class='card-body']")
    public WebElement welcomeMessage;

    public QaProjectHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
