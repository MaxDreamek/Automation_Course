package lesson29;


import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import pageobject.init.SelenideWebDriver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.source;
import static com.codeborne.selenide.WebDriverRunner.url;

public class SelenideCommonMethods extends SelenideWebDriver implements IHeader {
    @Test
    public void testCommonMethods(){
        open(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        SelenideElement buttonSearch = $x("//button[contains(@class,  'search-form__submit')]");
        SelenideElement buttonSearchByText = $(byText("Найти"));
        String btnSearch = buttonSearch.getText();
        System.out.println(btnSearch);

        String getAttributeLocalName = buttonSearch.attr("LocalName");
        System.out.println(getAttributeLocalName);

        String getCssBackgroundColor = buttonSearch.getCssValue("background-color");
        System.out.println(getCssBackgroundColor);

        String currentUrl = url();
        System.out.println(currentUrl);

        String currentSource = source();
        System.out.println(currentSource);
    }
}
