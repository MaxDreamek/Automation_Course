package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pageobject.init.WebDriverInit.getElementWillBePresent;

public class ProductPageLogic extends ProductPage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public ProductPageLogic(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement salePlate() {
        return getElementWillBePresent(webDriverWait, mainProductSalePlate);
    }
}
