package pattern.pageobject.selenide;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPageLocators {
    ElementsCollection titlesOfProducts = $$x("//span[@class='goods-tile__title']");
}
