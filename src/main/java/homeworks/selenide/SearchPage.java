package homeworks.selenide;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.page;


public class SearchPage extends SearchPageLocators {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickOnProductByIndex(int titleIndex) {
        titlesOfProducts.get(titleIndex).click();
        return page(ProductPage.class);
    }

}
