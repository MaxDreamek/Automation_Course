package pattern.pageobject.selenide;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SideBarCategoryPageLocators {
    ElementsCollection sidebarCategories = $$x("//div[@class='tile-cats']");
}
