package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pattern.pageobject.init.WebDriverInit.scrollToElement;

public class ComputersAndLaptopsPageLogic extends ComputersAndLaptopsPage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public ComputersAndLaptopsPageLogic(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LaptopsPageLogic openLaptopCategory() {
        WebElement laptopCategoryLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(laptopCategory));
        scrollToElement(driver, laptopCategoryLink, true);
        laptopCategoryLink.click();
        return new LaptopsPageLogic(driver);
    }

}
