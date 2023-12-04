package pattern.pageobject.selenide;

import org.openqa.selenium.WebDriver;


public class SearchPage extends SearchPageLocators {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage clickOnProductByIndex(int titleIndex){
        titlesOfProducts.get(titleIndex).click();
        return new ProductPage(driver);
    }

}
