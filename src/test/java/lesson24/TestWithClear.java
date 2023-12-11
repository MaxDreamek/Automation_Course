package lesson24;

import pattern.pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWithClear extends WebDriverInit {
    @Test
    public void testClear() throws InterruptedException {
        driver.get("https://www.google.com.ua");
        WebElement inputSearch = driver.findElement(By.id("APjFqb"));
        inputSearch.sendKeys("Hello word");
        Thread.sleep(5000);
        inputSearch.clear();
        Thread.sleep(5000);
    }
}
