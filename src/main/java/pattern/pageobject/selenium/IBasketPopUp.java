package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public interface IBasketPopUp {
    By product = By.xpath("//a[@class='cart-product__title']");
    default void checkMatchTitleOfProductI(WebDriverWait webDriverWait, String expectedTitle, SoftAssert softAssert){
        String titleOfAddedProductBasket = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(product)).getText().trim();
        softAssert.assertEquals(titleOfAddedProductBasket, expectedTitle, "Product titles in the product card and in the basket don't match");
    }
}
