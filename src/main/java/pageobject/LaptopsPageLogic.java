package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LaptopsPageLogic extends LaptopsPage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;


    public LaptopsPageLogic(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LaptopsPageLogic waitForPageLoad() {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(frameWichLastLoaded));
        return this;
    }

    public LaptopsPageLogic filterByRozetkaSeller() {
        driver.findElement(rozetkaSellerFilter).click();
        return this;
    }

    public LaptopsPageLogic setLowFilterByPrice(int lowPrice) {
        WebElement filterLowPrice = webDriverWait.until(ExpectedConditions.elementToBeClickable(inputPriceFilterLow));
        filterLowPrice.clear();
        filterLowPrice.sendKeys(String.valueOf(lowPrice));
        return this;
    }

    public LaptopsPageLogic setHighFilterByPrice(int highPrice) {
        WebElement filterInputHighPrice = webDriverWait.until(ExpectedConditions.elementToBeClickable(inputPriceFilterHigh));
        scrollToElement(driver, filterInputHighPrice, false);
        scrollToElement(driver, filterInputHighPrice, false);
        filterInputHighPrice.clear();
        filterInputHighPrice.sendKeys(String.valueOf(highPrice));
        return this;
    }

    public LaptopsPageLogic clickSubmitPriceFiler() {
        getElementBy(driver, submitPriceFilterBtn).click();
        return this;
    }

    public ProductPageLogic openFirstProductByPromoPlateText(String plateText) {
        List<WebElement> products = getElementsBy(driver, listProductsPromoPlate);
        for (int i = 0; i < products.size(); i++) {
            String expectedText = products.get(i).getAttribute("outerText");
            if (expectedText.equalsIgnoreCase(plateText)) {
                WebElement firstProductWithTextPlate = getProductLinkInListing(++i);
                scrollToElement(driver, firstProductWithTextPlate, false);
                firstProductWithTextPlate.click();
                break;
            } else if (i == products.size() - 1) {
                throw new IllegalArgumentException("Товара с Промо плашкой " + plateText + " не найдено");
            }
        }
        return new ProductPageLogic(driver);
    }

    private WebElement getProductLinkInListing(int elementNumber) {
        return getElementBy(driver, By.xpath("(//rz-catalog//a[@title])[" + elementNumber + "]"));
    }

}
