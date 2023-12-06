package pattern.pageobject.selenide;


import com.codeborne.selenide.Condition;
import homeworks.selenide.CategoryListingPage;

import static com.codeborne.selenide.Selenide.page;


public class SideBarCategoryPage extends SideBarCategoryPageLocators {

    public homeworks.selenide.CategoryListingPage openCategoryListing(int numberOfCategory) {
        sidebarCategories.get(--numberOfCategory).shouldBe(Condition.visible).scrollTo().click();
        return page(CategoryListingPage.class);
    }
}
