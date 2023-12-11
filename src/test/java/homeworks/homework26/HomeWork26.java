package homeworks.homework26;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobject.MainPageLogic;
import init.WebDriverInit;
import org.testng.annotations.Test;


public class HomeWork26 extends WebDriverInit {
    @Test
    public void testCheckSalePlate() {
        driver.get(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        MainPageLogic mainPageLogic = new MainPageLogic(driver);
        WebElement salePlate = mainPageLogic.openComputersAndLaptopsPage()
                .openLaptopCategory()
                .waitForPageLoad()
                .filterByRozetkaSeller()
                .setHighFilterByPrice(100000).clickSubmitPriceFiler()
                .openFirstProductByPromoPlateText("акція")
                .salePlate();
        Assert.assertTrue(salePlate.isDisplayed(), "Sale plate is not displayed");
    }
}
