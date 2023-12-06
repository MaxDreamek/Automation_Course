package homeworks.selenide;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPageLocators {
    ElementsCollection titlesOfProducts = $$x("//span[@class='goods-tile__title']");
}
