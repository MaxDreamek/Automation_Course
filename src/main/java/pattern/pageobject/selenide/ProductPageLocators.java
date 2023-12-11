package pattern.pageobject.selenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPageLocators {
    SelenideElement titleProduct = $x("//div[@class='product__heading']/h1");
}
