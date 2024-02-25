package lekcijaSesi.pageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAProjectLoginPage extends BasePage{

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
   public WebElement passwordInput;

    @FindBy(className = "btn-primary")
    WebElement loginButton;

    @FindBy(className = "invalid-feedback")
    WebElement loginErrorMessage;

    public QAProjectLoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new HomePage(driver);
    }

    public String getErrorMessage() {
        waitForElementToAppear(By.className("invalid-feedback"));
        return loginErrorMessage.getText();
    }

    public String getValidationErrorMessage(WebElement element) {
        return element.getAttribute("validationMessage");
    }

}
