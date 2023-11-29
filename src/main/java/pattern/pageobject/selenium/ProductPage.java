package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends ProductPageLocators{
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        WebElement titleOnProduct = driver.findElement(titleProduct);
        return titleOnProduct.getAttribute("innerText");
    }
}
