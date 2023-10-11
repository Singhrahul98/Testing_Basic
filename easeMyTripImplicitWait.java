import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class easeMyTripImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.easemytrip.com/flights.html");
     //   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement fromLocation = driver.findElement(By.xpath("//*[@id=\"FromSector_show\"]"));
        fromLocation.click();
        WebElement fromSearchBar = driver.findElement(By.xpath("//*[@id=\"a_FromSector_show\"]"));
        fromSearchBar.sendKeys("kolkata", Keys.RETURN);
        WebElement suggestionList = driver.findElement(By.xpath("//ul[@class=\"ausuggest\"]/parent::div[@id =\"fromautoFill\"]/child::ul"));
        suggestionList.click();
        System.out.println("select the from location");
        WebElement toLocation = driver.findElement(By.xpath("//*[@id=\"Editbox13_show\"]"));
        toLocation.click();
        WebElement toLocationBar = driver.findElement(By.xpath("//*[@id=\"a_Editbox13_show\"]"));
        toLocationBar.sendKeys("delhi",Keys.RETURN);
        WebElement suggestionList1  = driver.findElement(By.xpath("(// li[@onchange=\"ChangeCabin();\"]/child::div[@class=\"mflexcol\"])[2]"));
        suggestionList1.click();
        System.out.println("selected the to location");
        WebElement searchButton = driver.findElement(By.xpath("//button[@class=\"srchBtnSe\"]"));
        searchButton.click();
        System.out.println("Clicked on searchButton");
        WebElement bookNowBtn = driver.findElement(By.xpath("//button[text()=\"Book Now\"]"));
        bookNowBtn.click();
        System.out.println("BookNow Button clicked");
        Thread.sleep(10000);
        driver.quit();
    }
}
