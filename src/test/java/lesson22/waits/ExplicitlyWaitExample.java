package lesson22.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitlyWaitExample {
    private WebDriver driver;
    private WebDriverWait webDriverWait;
    @BeforeTest
    public void initDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void testWithImplicitWait(){
        driver.get("https://www.google.com.ua/");
        WebElement someElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Мне повезёт!']")));
        someElement.click();

        WebElement someElement2 = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Мне повезёт!']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(someElement2));

    }
}
