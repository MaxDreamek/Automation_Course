package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestWindowHandle extends WebDriverInit {
    @Test
    public void testIsSelect() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement logInButton= driver.findElement(By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        logInButton.click();

        WebElement registrationButton = driver.findElement(By.xpath("//button[contains(@class, 'auth-modal__register-lin')]"));
        registrationButton.click();

        WebElement privatePolicyButton = driver.findElement(By.xpath("//p[@class='form__caption']/a[2]"));
        privatePolicyButton.click();

        Thread.sleep(3000);

        Set<String> handles = driver.getWindowHandles();
        List<String> listHandles = new ArrayList<>(handles);
        driver.switchTo().window(listHandles.get(0));
        Thread.sleep(5000);
        driver.switchTo().window(listHandles.get(1));
    }
}
