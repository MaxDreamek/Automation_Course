package lesson26;

import pattern.pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestKeysExample extends WebDriverInit {

    @Test
    public void testFrame() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        changeCFCookie("3q1oG7v0ZCqdiy42LoluIYAcfys57RF.zDp2XWmzEuE-1700675396-0-1-8ee6ba3e.a07d5716.d9e7e5de-0.2.1700675396");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "mac"));

        Thread.sleep(5000);
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
}
