package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class CategoryListingPage extends CategoryListingPageLocators implements IHeader, IBasketPopUp {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public CategoryListingPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public CategoryListingPage clickBuyButtonOfProduct(int numberOfProduct) {
        List<WebElement> listingProductsList = driver.findElements(buyButtonsOfListingProducts);
        listingProductsList.get(--numberOfProduct).click();
        return this;
    }

    private String getNameOfProductByIndex(int indexOfProduct) {
        return driver.findElements(titlesOfProductInListing).get(indexOfProduct).getText().trim();
    }

    public CategoryListingPage checkBasketCount(SoftAssert softAssert, String expectedString) {
        checkBasketCounterI(webDriverWait, softAssert, expectedString);
        return this;
    }

    public CategoryListingPage checkProductInBasket(SoftAssert softAssert, int numberOfProductInListing, boolean finishedCheck) {
        String titleInListing = getNameOfProductByIndex(--numberOfProductInListing);
        openBasketPopUp(webDriverWait);
        checkMatchTitleOfProductI(webDriverWait, titleInListing, softAssert);
        if (finishedCheck) {
            softAssert.assertAll();
        }
        return this;
    }
}
