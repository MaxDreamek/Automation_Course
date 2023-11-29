package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends SearchPageLocators {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage clickOnProductByIndex(int titleIndex){
        List<WebElement> titles = driver.findElements(firsProduct);
        titles.get(titleIndex).click();
        return new ProductPage(driver);
    }

}
