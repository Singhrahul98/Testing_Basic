import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartComparisonAutomation {
    public static void main(String[] args) {




        // Instantiate ChromeDriver
      ChromeDriver driver = new ChromeDriver();

        try {
            // Step 1: Open https://www.flipkart.com
            driver.get("https://www.flipkart.com");

            // Step 2: Close the login pop-up if it appears
            WebElement closeBtn = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            closeBtn.click();

            // Step 3: Search for "fridge" and select "Fridge in Refrigerators" option from the dropdown
            WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
            searchBox.sendKeys("fridge");

            WebElement dropdownOption = driver.findElement(By.cssSelector("div.Y5-ZPI"));
            dropdownOption.click();

            // Step 4: Click on the first option to open the product in a new tab
            WebElement firstOption = driver.findElement(By.cssSelector("a._31qSD5"));
            String firstOptionUrl = firstOption.getAttribute("href");

            // Open the first option in a new tab
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.open('" + firstOptionUrl + "', '_blank');");

            // Step 5: Switch to the new tab and set the pin code to 110092
            String originalTab = driver.getWindowHandle();
            for (String tab : driver.getWindowHandles()) {
                if (!tab.equals(originalTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }

            WebElement pinCodeInput = driver.findElement(By.cssSelector("input._9c3vQ2"));
            pinCodeInput.clear();
            pinCodeInput.sendKeys("110092");
            pinCodeInput.sendKeys(Keys.ENTER);

            // Step 6: Close the tab and come back to the original tab
            driver.close();
            driver.switchTo().window(originalTab);

            // Step 7: Apply filters for the brand SAMSUNG
            WebElement brandFilter = driver.findElement(By.xpath("//div[text()='Brand']"));
            brandFilter.click();

            WebElement samsungFilter = driver.findElement(By.xpath("//div[text()='SAMSUNG']"));
            samsungFilter.click();

            // Step 8: Apply capacity filter of 301 - 400L
            WebElement capacityFilter = driver.findElement(By.xpath("//div[text()='Capacity']"));
            capacityFilter.click();

            WebElement minCapacityInput = driver.findElement(By.cssSelector("input._1qKb_B:nth-child(2)"));
            minCapacityInput.sendKeys("301");

            WebElement maxCapacityInput = driver.findElement(By.cssSelector("input._1qKb_B:nth-child(4)"));
            maxCapacityInput.sendKeys("400");

            WebElement applyButton = driver.findElement(By.cssSelector("button._2qFi1q"));
            applyButton.click();

            // Step 9: Display the total number of results
            WebElement totalResults = driver.findElement(By.cssSelector("span._2yAnYN"));
            System.out.println("Total results: " + totalResults.getText());

            // Step 10: Scroll down to find the last available/deliverable product
            boolean foundNotDeliverable = false;
            WebElement lastProduct = null;

            while (!foundNotDeliverable) {
                lastProduct = driver.findElement(By.cssSelector("div._2kHMtA:last-child"));

                try {
                    WebElement notDeliverableTag = lastProduct.findElement(By.cssSelector("div._2kHMtA._1KLc5W"));
                    foundNotDeliverable = true;
                } catch (NoSuchElementException e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].scrollIntoView(true);", lastProduct);
                }
            }

            // Step 11: Print the details (Name, price) of the last available product
            WebElement productName = lastProduct.findElement(By.cssSelector("a._4rR01T"));
            WebElement productPrice = lastProduct.findElement(By.cssSelector("div._30jeq3._1_WHN1"));

            System.out.println("Last available product:");
            System.out.println("Name: " + productName.getText());
            System.out.println("Price: " + productPrice.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the driver
            driver.quit();
        }
    }
}
