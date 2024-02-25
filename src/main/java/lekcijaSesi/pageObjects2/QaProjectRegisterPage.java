package lekcijaSesi.pageObjects2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaProjectRegisterPage {
    WebDriver driver;

    @FindBy(id = "name")
    public WebElement nameInputField;

    @FindBy(id = "last_name")
    public WebElement lastNameInputField;

    @FindBy(id = "email")
    public WebElement emailInputField;

    @FindBy(id = "email-confirm")
    public WebElement confirmEmailInputField;

    @FindBy(id = "birth_date")
    public WebElement birthDateField;

    @FindBy(id = "password")
    public WebElement passwordInputField;

    @FindBy(id = "password-confirm")
    public WebElement confirmPasswordInputField;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='card-header']")
    public WebElement registerFormHeaderSection;

    public QaProjectRegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillInRegisterForm(String name, String lastname, String emailAddress, String confirmEmailAddress,
            String dateOfBirth, String password, String confirmPassword, boolean isTCChecked) {
        nameInputField.sendKeys(name);
        lastNameInputField.sendKeys(lastname);
        emailInputField.sendKeys(emailAddress);
        confirmEmailInputField.sendKeys(confirmEmailAddress);
        birthDateField.sendKeys(dateOfBirth);
        registerFormHeaderSection.click();
        passwordInputField.sendKeys(password);
        confirmPasswordInputField.sendKeys(confirmPassword);
        if (isTCChecked) {
            termsAndConditionsCheckbox.click();
        }
        submitButton.click();
    }

}
