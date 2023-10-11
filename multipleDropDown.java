import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class multipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/select-menu");
        Select se = new Select(driver.findElement(By.xpath("//*[@id=\"cars\"]")));
        boolean result = se.isMultiple();
        System.out.println("Dropdown is Multiple : "+result);
        se.selectByVisibleText("Volvo");
        System.out.println("Select the option volvo");
        Thread.sleep(3000);
        se.selectByVisibleText("Saab");
        System.out.println("Select by visible text Saab");
        Thread.sleep(3000);
        se.selectByValue("audi");
        System.out.println("Select the option audi");
        Thread.sleep(3000);
        driver.close();
    }
}
