package pattern.pageobject.selenium;

import org.openqa.selenium.By;

public class CategoryListingPageLocators {
    By buyButtonsOfListingProducts = By.xpath("//app-buy-button[@extclass]");
    By titlesOfProductInListing = By.xpath("//span[@class='goods-tile__title']");
}
