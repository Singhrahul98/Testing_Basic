package Khushabu_AssertionOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class assertTrue {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://paytm.com/");
        WebElement paytmBusiness = driver.findElement(By.xpath("//*[@id=\"topNavData\"]/li[2]/div/a"));
        //If Condition is true
       // boolean condition = paytmBusiness.isDisplayed();

        //If condition is False
        boolean condition = !paytmBusiness.isDisplayed();
        System.out.println("The condition is: "+condition);

        //If Condition is true
       // Assert.assertTrue(condition);

        //assertFalse ke liye same Statement
        Assert.assertFalse(condition);


        //If condition is False
        Assert.assertFalse(condition, "Condition is not true");
        System.out.println("assert the condition");
        driver.close();
    }
}
