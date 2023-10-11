import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitTitleContains {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement bestSellers = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
        bestSellers.click();
        System.out.println("clicked on bestSellers");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.titleContains("Amazon.in Bestsellers: The most popular items on Amazon"));
        System.out.println("added the wait condition ");
        WebElement beauty = driver.findElement(By.xpath("//a[text()=\"Beauty\"]"));
        beauty.click();
        System.out.println("Clicked on beauty option");
        driver.close();
    }
}
