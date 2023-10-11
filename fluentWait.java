import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class fluentWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        //Fluent Wait Syntax line 14 to 16
        Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofSeconds(5)).
                ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt=\"IRCTC Logo\" and @class=\"h_logo\"])[2]")));
        WebElement alertLink = driver.findElement(By.xpath("//strong[text()=\"ALERTS\"]"));
        alertLink.click();
        System.out.println("clicked on alert Link");
        driver.close();

    }
}
