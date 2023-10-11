import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumCommand1 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //Get command launch any website
        driver.get("https://www.flipkart.com/");

        //Current Url Command
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is : "+CurrentUrl);

        //String Title Command
        String title = driver.getTitle();
        System.out.println("The title is: "+title);

        //Navigate Command back, forward, refresh
        driver.navigate().to("https://www.facebook.com/");
        System.out.println("Launch the facebook site");
        driver.navigate().forward();
        System.out.println("Clicked on forward button");
        driver.navigate().back();
        System.out.println("Clicked on back button");
        driver.navigate().refresh();
        System.out.println("Clicked on refresh button");








    }
}
