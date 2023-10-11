import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ebaySiteExample {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins-");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //Ebay SearchBar css selector
        WebElement searchBar = driver.findElement(By.cssSelector("input[id=\"gh-ac\"]"));
        searchBar.sendKeys("mobile");
        WebElement searchButton = driver.findElement(By.cssSelector("input[id=\"gh-btn\"]"));
        searchButton.click();
        System.out.println("clicked on search Button");
        //Execute with Java Script Executor
        (  (JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
        System.out.println("scrolled to page using JavaScript Executor");
        Thread.sleep(15000);
        driver.quit();

    }
}
