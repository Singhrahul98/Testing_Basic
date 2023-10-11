import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumCommand3 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rahul");
        System.out.println("Enter the email value");

        //Attribute and tagName Command
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        String attribute = searchButton.getAttribute("type");
        System.out.println("attribute is: "+attribute);

        String tagName = searchButton.getTagName();
        System.out.println("TagName is: "+tagName);


    }
}
