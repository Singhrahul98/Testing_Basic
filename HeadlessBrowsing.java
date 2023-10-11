import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class HeadlessBrowsing {
    public static void main(String[] args) throws IOException {
        //Headless & Submit & Sendkeys Command Example
        ChromeOptions Option = new ChromeOptions();
        Option.addArguments("--remote-allow-origins=*");
        Option.addArguments("headless");
        ChromeDriver driver = new ChromeDriver(Option);
        driver.get("https://www.flipkart.com/");
        WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        searchbutton.sendKeys("mobile");
        searchbutton.submit();
        TakesScreenshot scrnshot = ((TakesScreenshot)driver);
        File srcfile = scrnshot.getScreenshotAs(OutputType.FILE);
        File dstfile = new File("C:\\Users\\LENOVO\\Downloads\\ScreenShot\\flipkart5.jpg");
        FileHandler.copy(srcfile, dstfile);
        System.out.println("Capture the screenshot in flipkart site");
        driver.quit();
    }
}
