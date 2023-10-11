import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class checkBoxRadioEx {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value=\"checkbox1\"]"));
        checkBox1.click();
        Thread.sleep(10000);
        Assert.assertEquals(true,checkBox1.isSelected());
        System.out.println("validate the checkBox is selected using assertEquals");
        Assert.assertTrue(checkBox1.isSelected(),"checkBox is not Selected");
        System.out.println("Validate the checkBox is selected using AssertTrue");

        WebElement radioButton = driver.findElement(By.xpath("//input[@value=\"Option 1\"]"));
        radioButton.click();
        Thread.sleep(10000);
        Assert.assertEquals(true,radioButton.isSelected(),"radio button is not selected");
        System.out.println("Validate the radio button using AssertEquals");
        Assert.assertTrue(radioButton.isSelected(),"radio button is not selected");
        System.out.println("Validate the radio button using Assert True");
        driver.close();
    }
}
