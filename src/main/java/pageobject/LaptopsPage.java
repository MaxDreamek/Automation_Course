package pageobject;

import org.openqa.selenium.By;


public class LaptopsPage {
    By rozetkaSellerFilter = By.xpath("//a[@data-id='Rozetka']");
    By inputPriceFilterLow = By.xpath("//input[@formcontrolname='min']");
    By inputPriceFilterHigh = By.xpath("//input[@formcontrolname='max']");
    By submitPriceFilterBtn = By.xpath("//div[@class='slider-filter__inner']//button");
    By listProductsPromoPlate = By.xpath("//div[@class='goods-tile__content']/span");
    By frameWichLastLoaded = By.xpath("//iframe[@id='criteo-syncframe-onetag']");

}
