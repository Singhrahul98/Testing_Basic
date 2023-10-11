import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions Option = new ChromeOptions();
        Option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(Option);
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        Select se = new Select(driver.findElement(By.xpath("//*[@id=\"cars\"]")));
        boolean result = se.isMultiple();
        System.out.println("Dropdown is Multiple : "+result);
        se.selectByVisibleText("Volvo");
        System.out.println("Select the option volvo");
        Thread.sleep(10000);
        se.selectByVisibleText("Opel");
        System.out.println("Select the option opel");
        Thread.sleep(10000);
        se.selectByValue("audi");
        System.out.println("Select the option audi");
        Thread.sleep(10000);
        driver.close();
    }
}
