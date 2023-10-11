package Khushabu_AssertionOperation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class softAssert {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
        SoftAssert softAssert = new SoftAssert();
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is: "+actualTitle);
        String expectedTitle = "flipkart";
        softAssert.assertEquals(actualTitle,"flipkart","expected title is not equal to flipkart");
        softAssert.assertTrue(actualTitle.equalsIgnoreCase("flipkart"));
        softAssert.assertNull(expectedTitle,"expected title is not null");
        softAssert.assertAll();

    }
}
