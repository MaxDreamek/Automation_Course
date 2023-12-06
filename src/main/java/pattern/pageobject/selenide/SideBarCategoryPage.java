package pattern.pageobject.selenide;


import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.page;


public class SideBarCategoryPage extends SideBarCategoryPageLocators {

    public CategoryListingPage openCategoryListing(int numberOfCategory) {
        sidebarCategories.get(--numberOfCategory).shouldBe(Condition.visible).scrollTo().click();
        return page(CategoryListingPage.class);
    }
}
