package pattern.pageobject.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.*;

public interface IHeader {
    public SelenideElement BASKET_COUNTER = $x("//rz-icon-badge/span");
    public SelenideElement BASKET_ICON = $x("//button[@rzopencart]");
    public SelenideElement INPUT_SEARCH = $(By.name("search"));
    public SelenideElement SEARCH_BUTTON = $x("//button[contains(@class,  'search-form__submit')]");

    default void checkBasketCounterI(SoftAssert softAssert, String expectedString) {
        String basketCounterValue = BASKET_COUNTER.shouldBe(Condition.visible).getText().trim();
        softAssert.assertEquals(basketCounterValue, expectedString, "The basket counter is not equal to " + expectedString);
    }

    default void openBasketPopUp() {
        BASKET_ICON.shouldBe(Condition.enabled).click();
    }

    private void typeTextInInputSearch(String text) {
        INPUT_SEARCH.setValue(text);
    }

    private void clearOfInputSearch() {
        INPUT_SEARCH.clear();
    }

    private void clickBtnSearch() {
        SEARCH_BUTTON.click();
    }

    default void searchByValue(String text) {
        typeTextInInputSearch(text);
        clickBtnSearch();
    }

}
