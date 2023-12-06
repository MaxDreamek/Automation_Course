package homeworks.selenide;

import init.SelenideWebDriverInit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeWork29 extends SelenideWebDriverInit {
    @Test
    public void checkAddedProductToBasket() {
        open(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        SoftAssert softAssert = new SoftAssert();
        new MainPageLogic().openSideBarLink(1)
                .openCategoryListing(1)
                .clickBuyButtonOfProduct(1)
                .checkBasketCount(softAssert, "1")
                .checkProductInBasket(softAssert, 1, true);
    }
}