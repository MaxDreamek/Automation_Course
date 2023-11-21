package homeworks.homework25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RozetkaHm extends WebDriverInit {

    @Test
    public void privacyPolicyRozetkaTest()  {
        driver.get("https://rozetka.com.ua/");
        changeCFCookie("cOyGYfpEjtL5zSgVFNrZGaC1L5xB_knbplyziLrEkE4-1700604153-0-1-8ee6ba3e.46aafbc7.d9e7e5de-0.2.1700604153");

        WebElement languageSwitchButton = driver.findElement(By.xpath("//a[contains(@class, 'lang__link')]"));
        languageSwitchButton.click();

        WebElement logInButton= driver.findElement(By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        logInButton.click();
        WebElement registrationButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'auth-modal__register-lin')]")));
        registrationButton.click();
        WebElement privatePolicyButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='form__caption']/a[2]")));
        privatePolicyButton.click();

        SoftAssert softAssert = new SoftAssert();
        switchHandles(1);
        softAssert.assertTrue(driver.getTitle().contains("Угода користувача | ROZETKA"));
        softAssert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Как удалить аккаунт?"));
        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()='Как удалить аккаунт?']")).isDisplayed());

        softAssert.assertAll();
    }
}
