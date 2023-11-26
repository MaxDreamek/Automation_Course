package homeworks.homework24;

import pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HomeWork24 extends WebDriverInit {

    @Test
    public void writeMapToFileTest() throws IOException {
        driver.get("https://rozetka.com.ua/");

        WebElement laptopsAndCompCategory = driver.findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
        laptopsAndCompCategory.click();

        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='tile-cats__picture ng-star-inserted'])[1]")));
        subCategory.click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='criteo-syncframe-onetag']")));
        List<WebElement> listOfTitles = webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class = 'goods-tile__title']")));
        List<WebElement> valueOfProducts = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));

        Map<String, String> listOfProduct = new LinkedHashMap<>();
        for (int i = 0; i < listOfTitles.size(); i++) {
            listOfProduct.put(listOfTitles.get(i).getText().trim(), valueOfProducts.get(i).getText().replace("₴", ""));
        }

        FileWriter fileWriter = new FileWriter("rozetkaTest.txt");
        for (Map.Entry<String, String> product : listOfProduct.entrySet()) {
            fileWriter.write(product.getKey() + " " + product.getValue() + "\n");
        }
        fileWriter.close();
    }
}
