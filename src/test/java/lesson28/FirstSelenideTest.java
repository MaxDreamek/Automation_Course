package lesson28;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.init.SelenideWebDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class FirstSelenideTest extends SelenideWebDriver {
    @Test
    public void testSeleinde() {
        open("https://rozetka.com.ua/ua/");
        changeCFCookie("3YPxj0L29vz266TBp.9x6J9LQI8NDgXl7jZt7z_OfXI-1701716896-0-1-8ee6ba3e.e04c223a.d9e7e5de-0.2.1701716896");
        $(By.name("search")).setValue("Mac").pressEnter();
        sleep(5000);
    }

}
