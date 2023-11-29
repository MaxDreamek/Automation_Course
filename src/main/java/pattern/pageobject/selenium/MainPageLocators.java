package pattern.pageobject.selenium;

import org.openqa.selenium.By;

public class MainPageLocators {
    By sideBarCategories = By.xpath("//rz-sidebar-fat-menu//li");
    By inputSearch = By.name("search");
    By searchButton = By.xpath("//button[contains(@class,  'search-form__submit')]");

}
