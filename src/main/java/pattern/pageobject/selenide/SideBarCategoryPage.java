package pattern.pageobject.selenide;


import com.codeborne.selenide.*;
import org.openqa.selenium.WebDriver;


public class SideBarCategoryPage extends SideBarCategoryPageLocators {
    private WebDriver driver;

    public SideBarCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public CategoryListingPage openCategoryListing(int numberOfCategory) {
        sidebarCategories.shouldBe(CollectionCondition.sizeGreaterThan(0));
        sidebarCategories.get(--numberOfCategory).scrollTo().click();
        return new CategoryListingPage(driver);
    }
}
