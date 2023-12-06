package homeworks.homework27;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import pageobject.init.SelenideWebDriver;


import static com.codeborne.selenide.Selenide.*;
import static pattern.pageobject.selenide.IHeader.SEARCH_BUTTON;

public class TestSelenide extends SelenideWebDriver implements IHeader {
    @Test
    public void checkAddedProductToBasket() {
        open(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        SelenideElement languageSwitchButton = $x("//a[contains(@class, 'lang__link')]");
        languageSwitchButton.click();

        SelenideElement logInButton= $x("(//button[contains(@class, 'header__button')])[2]");
        logInButton.click();
        SelenideElement registrationButton = $x("//button[contains(@class, 'auth-modal__register-lin')]");
        registrationButton.shouldBe(Condition.enabled).click();
        SelenideElement privatePolicyButton = $x("//p[@class='form__caption']/a[2]");
        privatePolicyButton.shouldBe(Condition.enabled).click();
        switchTo().window(0);
        sleep(1000);
        switchTo().window(1);
        sleep(4000);

    }
}
