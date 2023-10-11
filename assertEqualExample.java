package Khushabu_AssertionOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class assertEqualExample {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is: "+actualTitle);

        //with two parameter statement
       //String expectedTitle = "Amazon.com. Spend less. Smile more.";

        //With three parameter Statement
        String expectedTitle = "Amazon.com. Spend less";
        //with two parameter
       // Assert.assertEquals(actualTitle, expectedTitle);

        //With three parameter when both are not same

        Assert.assertEquals(actualTitle, expectedTitle, "titles are not equal");
        System.out.println("Asserted the actual title and expected title ");
        driver.quit();


            }
}
