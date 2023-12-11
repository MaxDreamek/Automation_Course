package homeworks.homework25;

import pattern.pageobject.init.WebDriverInit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Hm25 extends WebDriverInit {
    @Test
    public void testPrivacyPolicy() {
        driver.get("https://www.autodoc.lu/");

        WebElement cookieDisallowButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-cookies='disallow_all_cookies']")));
        cookieDisallowButton.click();

        WebElement logInButton = driver.findElement(By.xpath("//div[@class='header-login__icon']"));
        logInButton.click();

        WebElement registerButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='popup__registration-link']")));
        registerButton.click();
        WebElement privacyLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='mb-1']//span")));
        privacyLink.click();


        switchHandles(driver,1);
        String stringInTitle = "Datenschutzerklärung";
        String searchText = "Sanktionslisten-Abgleich";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains(stringInTitle), "Title doesn't contains " + stringInTitle);
        softAssert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(searchText),
                "The element with " + searchText + " is missing");
        softAssert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), '" + searchText + "')]")).isDisplayed(),
                "There isn't element with " + searchText + " text");
        softAssert.assertAll();
    }
}
