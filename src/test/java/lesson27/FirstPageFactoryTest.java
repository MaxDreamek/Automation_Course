package lesson27;

import org.testng.Assert;
import org.testng.annotations.Test;
import init.WebDriverInit;
import pattern.factory.MainPage;

public class FirstPageFactoryTest extends WebDriverInit {
    final String EXPECTED_TITTLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    @Test
    public void firstTest() {
        driver.get(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        String actualTittle = new MainPage(driver).typeTextInInputSearch("Mac").clickBtnSearch()
                .clickOnProductTittleByIndex(0)
                .getTittleText();
        Assert.assertEquals(actualTittle, EXPECTED_TITTLE);
    }
}
