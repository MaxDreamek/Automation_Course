package homeworks.homework27;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pattern.pageobject.init.SelenideWebDriver;
import pattern.pageobject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class HomeWorkPajeObjectSelenide extends SelenideWebDriver {
    @Test
    public void checkAddedProductToBasket() {
        open(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        SoftAssert softAssert = new SoftAssert();
        new MainPageLogic().openSideBarLink(1)
                .openCategoryListing(1).clickBuyButtonOfProduct(1)
                .checkBasketCount(softAssert, "1").checkProductInBasket(softAssert, 1, true);
    }
}
