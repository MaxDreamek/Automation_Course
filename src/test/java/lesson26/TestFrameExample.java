package lesson26;

import pattern.pageobject.init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFrameExample extends WebDriverInit {

    @Test
    public void testFrame() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement frame = driver.findElement(By.id("mce_0_ifr"));

        driver.switchTo().frame(frame);
        WebElement inputInFrame = driver.findElement(By.id("tinymce"));
        inputInFrame.clear();
        inputInFrame.sendKeys("Hello World, I'm here");
        Thread.sleep(5000);

    }
}
