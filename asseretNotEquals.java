package Khushabu_AssertionOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class asseretNotEquals {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origin");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
        String actualURL = driver.getCurrentUrl();
        System.out.println("Actual Title is: "+actualURL);
        String expectedURL = "https://www.amamzon.com/";
        Assert.assertNotEquals(actualURL, expectedURL);
        System.out.println("Assert actual and expect URLs");
        driver.close();
    }
}
