import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CapturedScreenShot {
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //HeadLess Browsing testing
        //options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://paytm.com/");

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
        File dstfile = new File("C:\\Users\\LENOVO\\Downloads\\ScreenShot\\paytm23.png");
        FileHandler.copy(srcfile, dstfile);
        System.out.println("Captured the screenshot");
        driver.close();

    }
}