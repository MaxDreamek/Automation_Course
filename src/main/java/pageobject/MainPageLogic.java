package pageobject;

import org.openqa.selenium.WebDriver;



public class MainPageLogic extends MainPage {
    private WebDriver driver;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public ComputersAndLaptopsPageLogic openComputersAndLaptopsPage() {
        driver.findElement(laptopsAndComputersLink).click();
        return new ComputersAndLaptopsPageLogic(driver);
    }

}
