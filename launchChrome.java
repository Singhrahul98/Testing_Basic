import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.beans.IntrospectionException;

public class launchChrome {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.cricbuzz.com/");
        System.out.println("Launching the chrome Driver");

        //Launch the website
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(20000);
        driver.quit();



    }
}
