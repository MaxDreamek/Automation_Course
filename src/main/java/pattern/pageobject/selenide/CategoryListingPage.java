package pattern.pageobject.selenide;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


public class CategoryListingPage extends CategoryListingPageLocators implements IHeader, IBasketPopUp {
    private WebDriver driver;

    public CategoryListingPage(WebDriver driver) {
        this.driver = driver;
    }

    public CategoryListingPage clickBuyButtonOfProduct(int numberOfProduct) {
        buyButtonsOfListingProducts.get(--numberOfProduct).click();
        return this;
    }

    private String getNameOfProductByIndex(int indexOfProduct) {
        return titlesOfProductInListing.get(indexOfProduct).getText().trim();
    }

    public CategoryListingPage checkBasketCount(SoftAssert softAssert, String expectedString) {
        checkBasketCounterI(softAssert, expectedString);
        return this;
    }

    public CategoryListingPage checkProductInBasket(SoftAssert softAssert, int numberOfProductInListing, boolean finishedCheck) {
        String titleInListing = getNameOfProductByIndex(--numberOfProductInListing);
        openBasketPopUp();
        checkMatchTitleOfProductI(titleInListing, softAssert);
        if (finishedCheck) {
            softAssert.assertAll();
        }
        return this;
    }
}
