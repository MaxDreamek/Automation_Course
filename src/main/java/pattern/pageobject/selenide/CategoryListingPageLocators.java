package pattern.pageobject.selenide;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CategoryListingPageLocators {
    ElementsCollection buyButtonsOfListingProducts = $$x("//app-buy-button[@extclass]");
    ElementsCollection titlesOfProductInListing = $$x("//span[@class='goods-tile__title']");
}
