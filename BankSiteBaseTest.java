import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GuruBankSiteHomePage;
import pages.GuruBankSiteLoginPage;



public class BankSiteBaseTest {
    public static WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest(){
        GuruBankSiteLoginPage guruBankSiteLoginPage = new GuruBankSiteLoginPage(driver);
        guruBankSiteLoginPage.enterUserName("mngr515084");
        guruBankSiteLoginPage.enterPassword("pujAseq");
        guruBankSiteLoginPage.clickLoginBtn();
        GuruBankSiteHomePage guruBankSiteHomePage = new GuruBankSiteHomePage(driver);
        Assert.assertTrue(guruBankSiteHomePage.verifyUserLoggedIn(), "User is not logged in");
        System.out.println("User is successfully logged in");
    }

    @AfterTest
    public void tearDown(){
        GuruBankSiteHomePage guruBankSiteHomePage = new GuruBankSiteHomePage(driver);
        guruBankSiteHomePage.clickOnLogout();
        driver.quit();
    }
}
