package lesson25;

import pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestIsSelected extends WebDriverInit {
    @Test
    public void testIsSelect() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement logInButton = driver.findElement(By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        logInButton.click();

        WebElement checkBoxRememberMe = driver.findElement(By.xpath("//input[@id='remember_me']"));

        WebElement rememberCheckboxText = driver.findElement(By.xpath("//label[@for='remember_me']"));

        System.out.println(checkBoxRememberMe.isSelected());

        rememberCheckboxText.click();
        System.out.println(checkBoxRememberMe.isSelected());
        Thread.sleep(5000);
    }
}
