package lesson26;

import pattern.pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestSelectAutodoc extends WebDriverInit {

    @Test
    public void testSelectAutodoc() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        WebElement cookiesNotification = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.linkText("Alle Cookies erlauben")));
        if(cookiesNotification.isDisplayed()){
            cookiesNotification.click();
        }
        getMarkByValue(driver, "2");
        Thread.sleep(5000);
    }

    public void getMarkByValue(WebDriver driveFromTest, String markValue)  {
        WebElement makerList = driver.findElement(By.id("form_maker_id"));
        makerList.click();
//        WebElement makerListOption = driver.findElement(By.xpath("//select[@id='form_maker_id']/optgroup[2]/option[@value=" + markValue + "]"));
        String markOption = String.format("//select[@id='form_maker_id']/optgroup[2]/option[@value= '%s']", markValue);
        driveFromTest.findElement(By.xpath(markOption)).click();
    }
}
