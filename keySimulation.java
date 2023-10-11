import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class keySimulation {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstName).click().keyDown(firstName, Keys.SHIFT).sendKeys(firstName,"Rahul").build().perform();
        System.out.println("Using key Simulation for entering the Capital letter name ");
        Thread.sleep(10000);
        actions.keyUp(firstName,Keys.SHIFT).sendKeys(firstName,"singh").build().perform();
        System.out.println("Using Key Simulation for entering the small letter name");
        Thread.sleep(1000);
    }
}
