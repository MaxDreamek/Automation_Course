package pageobject;

import org.openqa.selenium.WebDriver;

import static pageobject.init.WebDriverInit.getElementBy;

public class MainPageLogic extends MainPage {
    private WebDriver driver;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public ComputersAndLaptopsPageLogic openComputersAndLaptopsPage() {
        getElementBy(driver, laptopsAndComputersLink).click();
        return new ComputersAndLaptopsPageLogic(driver);
    }

}
