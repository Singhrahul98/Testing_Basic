import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class isEnabledEx {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.swiggy.com/");
        WebElement location = driver.findElement(By.xpath("//*[@id=\"location\"]"));
        Assert.assertTrue(location.isEnabled(),"location is not enabled");
        System.out.println("validate the location field using AssertTrue");
        location.sendKeys("delhi");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"_2W-T9\"  and text() =\"Delhi, India\"]")));
        WebElement delhiLocation = driver.findElement(By.xpath("//span[@class=\"_2W-T9\"  and text() =\"Delhi, India\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(delhiLocation).click().perform();
        (  (JavascriptExecutor)driver).executeScript("orgument[0].click()",delhiLocation);
        System.out.println("selected the delhi location given the suggestions list");
        Thread.sleep(10000);
        driver.close();
    }
}
