package pattern.pageobject.selenide;


public class ProductPage extends ProductPageLocators {

    public String getTitleText() {
        return titleProduct.getAttribute("innerText");
    }
}
