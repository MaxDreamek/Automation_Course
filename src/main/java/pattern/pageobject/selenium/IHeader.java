package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public interface IHeader {
    By BASKET_COUNTER = By.xpath("//rz-icon-badge/span");
    By BASKET_ICON = By.xpath("//button[@rzopencart]");

    default void checkBasketCounterI(WebDriverWait webDriverWait, SoftAssert softAssert, String expectedString){
        String basketCounterValue = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(BASKET_COUNTER)).getText().trim();
        softAssert.assertEquals(basketCounterValue, expectedString, "The basket counter is not equal to " + expectedString);
    }
    default void openBasketPopUp(WebDriverWait webDriverWait){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(BASKET_ICON)).click();
    }

}
