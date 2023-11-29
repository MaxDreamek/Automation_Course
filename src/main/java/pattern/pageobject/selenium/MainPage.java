package pattern.pageobject.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends MainPageLocators{

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage typeTextInInputSearch(String text){
        driver.findElement(inputSearch).sendKeys(text);
        return this;
    }
    public MainPage clearOfInputSearch(){
        driver.findElement(inputSearch).clear();
        return this;
    }
    public SearchPage clickBtnSearch(){
        WebElement searchBtn = driver.findElement(searchButton);
        searchBtn.click();
        return new SearchPage(driver);
    }
}
