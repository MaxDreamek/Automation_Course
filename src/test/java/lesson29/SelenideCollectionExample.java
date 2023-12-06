package lesson29;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;
import pageobject.init.SelenideWebDriver;

import static com.codeborne.selenide.Selenide.*;

public class SelenideCollectionExample extends SelenideWebDriver {
    @Test
    public void testCollections(){
        open(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        ElementsCollection sideMenu = $$x("//rz-sidebar-fat-menu//li");
        int collectionSize = sideMenu.size();
        System.out.println(collectionSize);
        sideMenu.shouldHave(CollectionCondition.size(17));
        String text = sideMenu.get(1).getText();
        System.out.println(text);

        ElementsCollection filterCollection = sideMenu.filterBy(Condition.text("Товары для геймеров"));
        System.out.println(filterCollection.size());


    }
}
