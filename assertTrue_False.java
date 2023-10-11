package Khushabu_AssertionOperation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class assertTrue_False {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        String URL = driver.getCurrentUrl();
        System.out.println("the url of current page is: "+URL);
        boolean condition = URL.equalsIgnoreCase("https://www.flipkart.com/");

        Assert.assertFalse(condition,"condition is true");
        System.out.println("asserted the condition using assertFalse");

        //assertNull Assertion operation
        driver.get("https://www.amazon.com/");
        //With null value
        //String checkValue = null;

        //With another value and assertNotNull same in one statement me hi
        String checkValue = driver.getTitle();
        System.out.println("The title is: "+checkValue);
        Assert.assertNotNull(checkValue);
        System.out.println("assertion verification of the value: "+checkValue);

    }
}
