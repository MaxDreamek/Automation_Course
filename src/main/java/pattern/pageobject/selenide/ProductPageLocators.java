package pattern.pageobject.selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPageLocators {
    SelenideElement titleProduct = $x("//div[@class='product__heading']/h1");
}
