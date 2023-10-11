import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumCommand2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://omayo.blogspot.com/2013/05/page-one.html");

        //Click Operatopn
        WebElement element = driver.findElement(By.xpath("//*[@id=\"alert1\"]"));
        element.click();

        //Get text Command
        WebDriver driver1 = new ChromeDriver(options);
        driver1.get("https://www.flipkart.com/");
        WebElement element1 = driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
        String text = element1.getText();
        System.out.println("Text is: "+ text);

        //IsSelected Command
        WebElement element2 = driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        boolean result = element2.isSelected();
        System.out.println("Element2 is selected: "+ result);

        //isEnabled Command
        WebElement searchButton = driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        boolean result1 = searchButton.isEnabled();
        System.out.println("Search button is enabled: "+ result1);

        //isDisplayed Command
        boolean result2 = searchButton.isDisplayed();
        System.out.println("Search Button is displayed: "+result2);

        //get Size Command
        Dimension dimension = searchButton.getSize();
        System.out.println("hight is: "+dimension.height + " Width is: "+dimension.width);

        //Get Page source command
        String pageSource = driver1.getPageSource();
        System.out.println("Page source is: "+pageSource);
        driver1.close();
    }
}
