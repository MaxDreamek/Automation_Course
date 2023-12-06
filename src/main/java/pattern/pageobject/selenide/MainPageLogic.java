package pattern.pageobject.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.page;


public class MainPageLogic extends MainPageLocators implements IHeader {

    public SideBarCategoryPage openSideBarLink(int numberOfCategory) {
        sideBarCategories.get(--numberOfCategory).shouldBe(Condition.visible).click();
        return page(SideBarCategoryPage.class);
    }

    public MainPageLogic checkCategoriesQuantity(int categories){
        sideBarCategories.shouldHave(CollectionCondition.size(categories));
        return this;
    }

    public SearchPage searchByText(String text) {
        searchByValue(text);
        return page(SearchPage.class);
    }
}
