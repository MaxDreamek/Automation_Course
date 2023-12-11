package homeworks.homework27;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pattern.pageobject.init.WebDriverInit;
//import pattern.pageobject.selenium.MainPage;

public class HomeWorkPajeObject extends WebDriverInit {
    @Test
    public void checkAddedProductToBasket() {
        driver.get(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        SoftAssert softAssert = new SoftAssert();
//        new MainPage(driver).openSideBarLink(1)
//                .openCategoryListing(1).clickBuyButtonOfProduct(1)
//                .checkBasketCount(softAssert, "1").checkProductInBasket(softAssert, 1, true);
    }
}
