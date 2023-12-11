package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestJsExecutorScroll extends WebDriverInit {
    @Test
    public void testScrollViaJs() throws InterruptedException {
        driver.get("https://rozetka.com.ua/ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,  'search-form__submit')]"));
        searchButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 1000)", "");
        Thread.sleep(5000);
    }
}
