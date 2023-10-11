import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class irctcAssertion {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins-");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement irctcLogo = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[1]/span[2]/img"));
        Assert.assertEquals(true,irctcLogo.isDisplayed());
        System.out.println("validate the irctc logo by using AssertEqual");
        Assert.assertTrue(irctcLogo.isDisplayed());
        System.out.println("validated the Assert by using AsserTrue");
        WebElement askDisha = driver.findElement(By.xpath("//a[text()=\" ASK DISHA \"]"));
        String expectedText = "ASK DISHA";
        Assert.assertEquals(askDisha.getText(), expectedText, "both String are not equal");
        System.out.println("Validate the String Equality using assertEqual");
        driver.quit();
    }
}
