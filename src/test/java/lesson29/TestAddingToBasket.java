package lesson29;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pattern.pageobject.init.SelenideWebDriver;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestAddingToBasket extends SelenideWebDriver {
   @Test
   public void testAddingToBasket(){
       open(DEFAULT_URL);
       changeCFCookie(cfClearanceCookie);
       $x("(//rz-sidebar-fat-menu//li)[1]").click();
       $x("(//div[@class='tile-cats'])[1]").shouldBe(Condition.appear).click();
       $x("(//app-buy-button[@extclass])[1]").shouldBe(Condition.enabled).click();
       String titleOfAddedProductInCart = $x("(//span[@class='goods-tile__title'])[1]").getText().trim();
       String basketCounter = $x("//rz-icon-badge/span").getText().trim();
       SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(basketCounter, "1", "The basket counter is not equal to 1");
       $x("//button[@rzopencart]").click();
       String titleOfAddedProductBasket = $x("//a[@class='cart-product__title']").shouldBe(Condition.visible).getText().trim();
       softAssert.assertEquals(titleOfAddedProductBasket, titleOfAddedProductInCart, "Product titles in the product card and in the basket don't match");
       softAssert.assertAll();
   }
}
