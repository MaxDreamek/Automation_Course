package pattern.pageobject.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPageLocators {
    ElementsCollection sideBarCategories = $$x("//rz-sidebar-fat-menu//li");
    SelenideElement inputSearch = $(By.name("search"));
    SelenideElement searchButton = $x("//button[contains(@class,  'search-form__submit')]");

}
