package waits;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import waits.pageObjects.SeleniumPage;

public class BaseTest {
    WebDriver driver;
    SeleniumPage seleniumPage;

    @BeforeMethod
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        initPageObjects();
    }

    private void initPageObjects(){
        seleniumPage = new SeleniumPage(driver);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

}
