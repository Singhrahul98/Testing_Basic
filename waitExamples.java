import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class waitExamples {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        searchButton.sendKeys("mobiles");
        //Submit is alternate option of click button
       // searchButton.submit();
        searchBar.click();
        //Another alternate option of click button
       // searchButton.sendKeys(Keys.ENTER);
        System.out.println("search button clicked");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement result = driver.findElement(By.xpath("//span[text() = \"Results\"]"));
        //Explicit wait Statement
        wait.until(ExpectedConditions.visibilityOf(result));
        System.out.println("have given the wait to wait for element to be displayed");
        boolean condition = result.isDisplayed();
        System.out.println("Result condition is: "+condition);
        driver.close();

    }
}
