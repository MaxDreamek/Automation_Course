package lesson27;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.init.WebDriverInit;
import pattern.pageobject.selenium.MainPage;

public class FirstPageObjectTest extends WebDriverInit {
    private final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    @Test
    public void firstTest() {
        driver.get(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        String actualString = new MainPage(driver).typeTextInInputSearch("Mac").clickBtnSearch().
                clickOnProductByIndex(0).getTitleText();
        Assert.assertEquals(actualString, EXPECTED_TITLE);
    }
}
