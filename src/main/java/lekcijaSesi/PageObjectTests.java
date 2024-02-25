package lekcijaSesi;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import lekcijaSesi.pageObjects2.QaProjectHomePage;
import lekcijaSesi.pageObjects2.QaProjectLandingPage;
import lekcijaSesi.pageObjects2.QaProjectRegisterPage;

public class PageObjectTests extends QaProjectBaseTest {

    @Test
    public void checkAllElementsOnLandingPageTest() {
        QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
        Assert.assertEquals(qaProjectLandingPage.checkIfElementsExistOnPage(), true);
    }

    @Test
    public void testSuccessfulRegistration() throws InterruptedException {
        Faker faker = new Faker();
        QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
        qaProjectLandingPage.registerLink.click();
        String emailAddress = faker.internet().emailAddress();
        QaProjectRegisterPage qaProjectRegisterPage = new QaProjectRegisterPage(driver);
        String name = "Juris";
        String lastName = "Kreilis";
        qaProjectRegisterPage.fillInRegisterForm(name, "Kreilis", emailAddress, emailAddress, "01/26/1990",
                "parole123", "parole123", true);

        //parbaudisim, ka lietotajs ir ielogojies
        QaProjectHomePage qaProjectHomePage = new QaProjectHomePage(driver);
        Assert.assertEquals(qaProjectHomePage.menuDropDown.getText(), name);
        Assert.assertEquals(qaProjectHomePage.welcomeMessage.getText(), "Welcome, " + lastName + "! You are logged in!");
    }

    @Test
    public void testSuccessfulRegistrationTCUnchecked() throws InterruptedException {
        Faker faker = new Faker();
        QaProjectLandingPage qaProjectLandingPage = new QaProjectLandingPage(driver);
        qaProjectLandingPage.registerLink.click();
        String emailAddress = faker.internet().emailAddress();
        QaProjectRegisterPage qaProjectRegisterPage = new QaProjectRegisterPage(driver);
        qaProjectRegisterPage.fillInRegisterForm("Juris", "Kreilis", emailAddress, emailAddress, "01/26/1990",
                "parole123", "parole123", false);
        Thread.sleep(50000);
    }

}
