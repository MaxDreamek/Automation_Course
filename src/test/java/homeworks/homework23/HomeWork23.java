package homeworks.homework23;

import pattern.pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeWork23 extends WebDriverInit {
    @Test
    public void addingProductToBasketTest() {
        driver.get("https://rozetka.com.ua/");
        SoftAssert softAssert = new SoftAssert();

        WebElement desktopsAndLaptops = driver.findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
        desktopsAndLaptops.click();

        WebElement laptopsIcon = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='tile-cats__picture ng-star-inserted'])[1]")));
        laptopsIcon.click();

        WebElement buyButtonOfFirstProduct = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//app-buy-button[@extclass='goods-tile__buy-button'])[1]")));
        buyButtonOfFirstProduct.click();
        String titleOfAddedProductInCart = driver.findElement(By.xpath("(//span[@class='goods-tile__title'])[1]")).getText().trim();

        String basketCounter = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//rz-icon-badge/span")))).getText().trim();

        softAssert.assertEquals(basketCounter, "1", "The basket counter is not equal to 1");

        WebElement basketIcon = driver.findElement(By.xpath("//button[@rzopencart]"));
        basketIcon.click();

        String titleOfAddedProductBasket = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cart-product__title']"))).getText().trim();
        softAssert.assertEquals(titleOfAddedProductBasket, titleOfAddedProductInCart, "Product titles in the product card and in the basket don't match");
        softAssert.assertAll();
    }
}
