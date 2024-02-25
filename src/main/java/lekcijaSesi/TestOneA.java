package lekcijaSesi;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOneA extends BaseTest{
    @Test
    public void test123(){
        driver.get("https://www.1a.lv/");
        Assert.assertEquals(driver.findElements(By.id("cookiebanner")).size(),1);
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        Assert.assertEquals(driver.findElements(By.id("cookiebanner")).size(),0);

    }
}
