package pattern.pageobject.selenide;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends ProductPageLocators {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        return titleProduct.getAttribute("innerText");
    }
}
