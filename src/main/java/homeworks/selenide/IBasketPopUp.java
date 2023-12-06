package homeworks.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$x;

public interface IBasketPopUp {
    SelenideElement PRODUCT = $x("//a[@class='cart-product__title']");

    default void checkMatchTitleOfProductI(String expectedTitle, SoftAssert softAssert) {
        String titleOfAddedProductBasket = PRODUCT.shouldBe(Condition.visible).getText().trim();
        softAssert.assertEquals(titleOfAddedProductBasket, expectedTitle, "Product titles in the product card and in the basket don't match");
    }
}
