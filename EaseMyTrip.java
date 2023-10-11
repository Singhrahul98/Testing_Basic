import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class EaseMyTrip {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.easemytrip.com/flights.html");
        driver.manage().window().maximize();
        WebElement more = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/div[1]/ul/li[9]/a"));
        Actions actions = new Actions(driver);
        //Clicked on more button
        actions.moveToElement(more).perform();
        Thread.sleep(3000);

        //Clicked on GiftCard
        WebElement giftCard = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/div[1]/ul/li[9]/div/a[3]"));
        actions.moveToElement(giftCard).click().perform();

        //Clicked On Faqs
        WebElement faq = driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[1]"));
        actions.moveToElement(faq).perform();
        Thread.sleep(10000);

        //clicked on Faqs 1st Question Clicked
        WebElement qustion1 = driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div[1]/div[1]"));
        actions.moveToElement(qustion1).click().perform();

        //Answer 1st Print on console
        WebElement answer = driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div[1]/div[2]/p"));
        String text = answer.getText();
        System.out.println("The text is: "+text);
    }
}
