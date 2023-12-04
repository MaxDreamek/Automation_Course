package pageobject.init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebDriverInit {
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    private final ChromeOptions chromeOptions = new ChromeOptions();
    public final String DEFAULT_URL = "https://rozetka.com.ua/";
    public final String cfClearanceCookie = "F7t9JlYGVX1Nfx7u0QSK0REtFItGF4rTU5QnZrTE9Gs-1701707173-0-1-8ee6ba3e.8cecf9f3.d9e7e5de-0.2.1701707173";


    @BeforeMethod
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-automation");
        chromeOptions.addArguments("--disable-extensions");
//        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("disable-infobars");
//        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }

    public void setProxy(String proxyIp){
        try {
            Proxy proxy = new Proxy();
            String[] myProxyIp = proxyIp.split(":");
            proxy.setHttpProxy(myProxyIp[0]);
            proxy.setSslProxy(myProxyIp[1]);
            this.chromeOptions.setCapability("proxy", proxy);
        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        };

    }
    public static void switchHandles(WebDriver driver, int windowNumber){
        List<String> listHandles = new ArrayList<>(driver.getWindowHandles());
        if (windowNumber < listHandles.size()) {
            driver.switchTo().window(listHandles.get(windowNumber));
        } else {
            throw new RuntimeException("This Window Handle is not Exist. Select correct window");
        }
    }
    public void changeCFCookie(String value){
        Cookie cookie = new Cookie("cf_clearance",value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }
    public static void scrollToElement(WebDriver driver, WebElement webElement, boolean intoView){
        ((JavascriptExecutor) driver).executeScript(String.format("arguments[0].scrollIntoView(%s)", intoView), webElement);
    }
    public WebElement findElementByXpath(String xpath){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
    public static WebElement getElementBy(WebDriver driver, By element){
        return driver.findElement(element);
    }
    public static WebElement getElementWillBeClickable(WebDriverWait webDriverWait, By element){
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement getElementWillBePresent(WebDriverWait webDriverWait, By element){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
    public static List<WebElement> getElementsBy(WebDriver driver,By element){
        return driver.findElements(element);
    }

}
