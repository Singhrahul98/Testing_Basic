import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteCostumer {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver =  new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        WebElement customerId = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        customerId.sendKeys("rahul");
        WebElement submitButton = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
        submitButton.click();
        System.out.println("clicked on submit button");
        String alertText1;
        alertText1 = driver.switchTo().alert().getText();
        System.out.println("Alert first text is: "+alertText1);
        driver.switchTo().alert().accept();
        System.out.println("clicked on ok button is displayed alert");
        String alertText2;
        alertText2 = driver.switchTo().alert().getText();
        System.out.println("Alert second text is: "+alertText2);
        driver.switchTo().alert().accept();
        System.out.println("accept the second alert");
        Thread.sleep(20000);
        driver.close();
    }
}
