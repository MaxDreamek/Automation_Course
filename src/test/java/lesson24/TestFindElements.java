package lesson24;

import pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class TestFindElements extends WebDriverInit {
    @Test
    public void findElements() {
        driver.get("https://rozetka.com.ua/");

        WebElement laptopsAndCompCategory = driver.findElement
                (By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
        laptopsAndCompCategory.click();

        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("(//a[@class='tile-cats__picture ng-star-inserted'])[1]")));
        subCategory.click();

        List<WebElement> listOfTitles = driver.findElements(By.xpath("//span[@class = 'goods-tile__title']"));
        for(WebElement e : listOfTitles){
            System.out.println(e.getText());
        }
        Assert.assertEquals(listOfTitles.size(), 60);
    }
}
