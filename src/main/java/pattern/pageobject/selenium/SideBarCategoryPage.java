package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SideBarCategoryPage extends SideBarCategoryPageLocators {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public SideBarCategoryPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public CategoryListingPage openCategoryListing(int numberOfCategory){
        List<WebElement> parentCategoriesList = webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(parentCategories));
        scrolToElement(parentCategoriesList.get(--numberOfCategory),true);
        parentCategoriesList.get(numberOfCategory).click();
        return new CategoryListingPage(driver);
    }
}
