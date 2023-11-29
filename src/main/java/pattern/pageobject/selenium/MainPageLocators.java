package pattern.pageobject.selenium;

import org.openqa.selenium.By;

public class MainPageLocators {
    By inputSearch = By.name("search");
    By searchButton = By.xpath("//button[contains(@class,  'search-form__submit')]");

}
