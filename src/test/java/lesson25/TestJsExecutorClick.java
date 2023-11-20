package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJsExecutorClick extends WebDriverInit {

    @Test
    public void testClickViaJs()  {
        driver.get("https://rozetka.com.ua/ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,  'search-form__submit')]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", searchButton);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", allLinks.get(i));
    }
}
