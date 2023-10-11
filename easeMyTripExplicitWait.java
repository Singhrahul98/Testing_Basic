import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class easeMyTripExplicitWait {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.easemytrip.com/flights.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement fromLocation = driver.findElement(By.xpath("//*[@id=\"FromSector_show\"]"));
        fromLocation.click();
        System.out.println("FromLocation clicked");
        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"a_FromSector_show\"]"));
        searchBar.sendKeys("kolkata", Keys.RETURN);
        WebElement suggestionList = driver.findElement(By.xpath("//ul[@class=\"ausuggest\"]/parent::div[@id =\"fromautoFill\"]/child::ul"));
        suggestionList.click();
        System.out.println("select the from location");
        WebElement toLocation = driver.findElement(By.xpath("//*[@id=\"Editbox13_show\"]"));
        toLocation.click();
        WebElement toLocationSearchBar = driver.findElement(By.xpath("//*[@id=\"a_Editbox13_show\"]"));
        toLocation.sendKeys("delhi",Keys.RETURN);
        //Explicit Wait Implimented
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(// li[@onchange=\"ChangeCabin();\"]/child::div[@class=\"mflexcol\"])[2]")));
        WebElement suggestionList1 = driver.findElement(By.xpath("(// li[@onchange=\"ChangeCabin();\"]/child::div[@class=\"mflexcol\"])[2]"));
        suggestionList1.click();
        System.out.println("selected the toLocation");
        WebElement dateSelector = driver.findElement(By.xpath("//*[@id=\"ddate\"]"));
        dateSelector.click();
        WebElement caladerDate = driver.findElement(By.xpath("//*[contains(@id,\"snd_4\")]"));
        caladerDate.click();
        System.out.println("date selected");
        WebElement searchBtn = driver.findElement(By.xpath("//button[@class=\"srchBtnSe\"]"));
        searchBtn.click();
        System.out.println("clicked on search button");
        WebElement bookButton = driver.findElement(By.xpath("//button[text()=\"Book Now\"]"));
        bookButton.click();
        System.out.println("clicked on book button");
      //  wait.until(ExpectedConditions.alertIsPresent());
        driver.quit();



    }
}
