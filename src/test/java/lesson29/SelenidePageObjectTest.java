package lesson29;

import org.testng.annotations.Test;
import pattern.pageobject.init.SelenideWebDriver;
import pattern.pageobject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.*;

public class SelenidePageObjectTest extends SelenideWebDriver {
    @Test
    public void selenidePageObjectTest(){
        open(DEFAULT_URL);
        changeCFCookie(cfClearanceCookie);
        new MainPageLogic().checkCategoriesQuantity(17).openSideBarLink(1)
                .openCategoryListing(1)
                .checkQuantityOfProductsTitles(60);
    }

//        driver.get("https://rozetka.com.ua/");
//
//        WebElement laptopsAndCompCategory = driver.findElement
//                (By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
//        laptopsAndCompCategory.click();
//
//        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable
//                (By.xpath("(//a[@class='tile-cats__picture ng-star-inserted'])[1]")));
//        subCategory.click();
//
//        List<WebElement> listOfTitles = driver.findElements(By.xpath("//span[@class = 'goods-tile__title']"));
//        for(WebElement e : listOfTitles){
//            System.out.println(e.getText());
//        }
//        Assert.assertEquals(listOfTitles.size(), 60);

}
