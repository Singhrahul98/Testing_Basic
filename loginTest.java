import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.guru99LoginPage;

public class loginTest {
    public static WebDriver driver;

    public static void setup(){
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/v1/index.php");
        driver.manage().window().maximize();
    }

    public static void verifyHeader(){
        guru99LoginPage page1 = new guru99LoginPage(driver);
        page1.validateHeaders();
            }

    public  static void login(){
        guru99LoginPage page1 = new guru99LoginPage(driver);
        page1.login();
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public static void main(String[] args) {
        setup();
        verifyHeader();
        login();
        closeBrowser();
    }
}
