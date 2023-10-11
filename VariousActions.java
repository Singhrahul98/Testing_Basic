import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class VariousActions {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        //Single Click Action Perform
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
        Actions actions = new Actions(driver);
        //Mousehover Action on specific element
        actions.moveToElement(element).perform();
        System.out.println("Mouse hover action perform on mobile element");
        Thread.sleep(1000);

        //Click And Hold Action Perform
        WebDriver driver1 = new ChromeDriver(options);
        driver1.get("https://www.amazon.in/");
        WebElement amamzon = driver1.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
        Actions actions1 = new Actions(driver1);
        actions1.clickAndHold(amamzon).build().perform();
        System.out.println("Click and hold Action perform on Best Seller");
        Thread.sleep(2000);

        //Double Click Action perform
        WebDriver driver2 = new ChromeDriver(options);
        driver2.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver2.manage().window().maximize();
        WebElement element1 = driver2.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
        Actions actions2 = new Actions(driver2);
        actions2.doubleClick(element1).build().perform();
        System.out.println("Double click perform on Element");
        Thread.sleep(2000);

        //Drag And Drop Actions Perform
        WebDriver driver3 = new ChromeDriver(options);
        driver3.get("https://demo.guru99.com/test/drag_drop.html");
        driver3.manage().window().maximize();
        WebElement source = driver3.findElement(By.xpath("//*[@id=\"fourth\"]/a[text() = \" 5000 \"]"));
        WebElement destination = driver3.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        Actions actions3 = new Actions(driver3);
        actions3.dragAndDrop(source, destination).build().perform();
        System.out.println("Drag and drop from one to another place");
        Thread.sleep(2000);

        //Right Click or Context click action perform
        WebDriver driver4 = new ChromeDriver(options);
        driver4.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver4.manage().window().maximize();
        WebElement rightContextClick = driver4.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
        Actions actions4 = new Actions(driver4);
        actions4.contextClick(rightContextClick).build().perform();
        System.out.println("Context Click is done");
        driver.quit();
    }
}
