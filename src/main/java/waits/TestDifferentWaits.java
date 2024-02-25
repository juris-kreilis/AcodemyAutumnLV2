package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestDifferentWaits extends BaseTest {
    @Test
    public void testWait(){
        seleniumPage.addABoxButton.click();
        seleniumPage.getBox();

        System.out.println();
    }
}
