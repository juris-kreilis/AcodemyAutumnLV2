package lekcijaSesi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MansPirmaisSeleniumTests extends BaseTest {

    @Test
    public void myFirstSeleniumTest() throws InterruptedException {
        //atveram parlukprogrammu
        //atvert konkretu lapu
        driver.get("https://www.google.lv/");
        Thread.sleep(5000);
        //aizveram parlukprogrammu
    }

    @Test
    public void checkPageTitleTest() {
        driver.get("https://acodemy.lv/lv");
        Assert.assertEquals(driver.getTitle(), "IT Kursi Latvijā", "Wrong page title!");
    }

    @Test
    public void checkPageURL(){
        //aizejam uz kautādu saiti
        driver.get("http://www.1a.lv");
        //rakstām assert pārbaudot vai URL sakrīt ar to, kuru jūs iekopējāt
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.1a.lv/","Wrong page URL");
    }

    //Uzrakstīt jaunu testu, kas pārbaudīs vai URL ir pareizs




}
