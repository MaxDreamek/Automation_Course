package pattern.pageobject.selenide;


import com.codeborne.selenide.CollectionCondition;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class CategoryListingPage extends CategoryListingPageLocators implements IHeader, IBasketPopUp {

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
    public CategoryListingPage checkQuantityOfProductsTitles(int titleAmount){
        titlesOfProductInListing.shouldBe(CollectionCondition.size(titleAmount), Duration.ofSeconds(10));
        return this;
    }
}
