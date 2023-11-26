package lesson26;

import pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestUploadExample extends WebDriverInit {

    @Test
    public void testUpload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        WebElement uploadButton = driver.findElement(By.id("file-submit"));

        uploadElement.sendKeys("D:\\Automation_Course\\somefile.txt");
        uploadButton.click();
        Thread.sleep(5000);
    }
}
