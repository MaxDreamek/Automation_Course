package lesson28;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import pageobject.init.SelenideWebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideConditionExample extends SelenideWebDriver {

    @Test
    public void testSecond(){
        open("https://rozetka.com.ua/ua/");
        changeCFCookie(cfClearanceCookie);
        $(By.name("search")).setValue("Mac");
        $(By.xpath("//button[contains(@class,  'search-form__submit')]")).shouldHave(Condition.text("Знайти"), Duration.ofSeconds(20)).click();
        sleep(5000);
    }
}
