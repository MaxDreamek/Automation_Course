package lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class WebDiverInteraction {

    private WebDriver driver;
    @BeforeTest
    public void initDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void examples(){
        WebElement inputSearch = driver.findElement(By.cssSelector(".someInputClass"));
        WebElement buttonSearch = driver.findElement(By.xpath("//div[@btnSearch]"));

        List<WebElement> elementList = driver.findElements(By.cssSelector(".myClass"));

        inputSearch.sendKeys("Some Text");
        buttonSearch.click();
        inputSearch.clear();

        String colorBtn = buttonSearch.getAttribute("color");
        String btnText = buttonSearch.getText();

        boolean isDisplayButtonSearch = buttonSearch.isDisplayed();


    }
}
