package pattern.pageobject.selenide;

import org.openqa.selenium.WebDriver;


public class MainPage extends MainPageLocators implements IHeader {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public SideBarCategoryPage openSideBarLink(int numberOfCategory) {
        sideBarCategories.get(--numberOfCategory).click();
        return new SideBarCategoryPage(driver);
    }

    public SearchPage searchByText(String text) {
        searchByValue(text);
        return new SearchPage(driver);
    }
}
