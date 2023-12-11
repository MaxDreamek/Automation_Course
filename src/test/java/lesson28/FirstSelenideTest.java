package lesson28;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pattern.pageobject.init.SelenideWebDriver;

import static com.codeborne.selenide.Selenide.*;

public class FirstSelenideTest extends SelenideWebDriver {
    @Test
    public void testSeleinde() {
        open("https://rozetka.com.ua/ua/");
        changeCFCookie("3YPxj0L29vz266TBp.9x6J9LQI8NDgXl7jZt7z_OfXI-1701716896-0-1-8ee6ba3e.e04c223a.d9e7e5de-0.2.1701716896");
        $(By.name("search")).setValue("Mac").pressEnter();
        sleep(5000);
    }

}
