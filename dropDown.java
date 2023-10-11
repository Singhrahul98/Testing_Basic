import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        //Drop down Command
        driver.get("https://leafground.com/select.xhtml");
        Select se = new Select(driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select")));

        //Select by Text
        se.selectByVisibleText("Playwright");
        System.out.println("select the dropdown value using selectBYVisibleText");

        //Select by index
        se.selectByIndex(1);
        System.out.println("Select the dropdown Value using Index");
        driver.quit();
    }
}
