package pageobject.init;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideWebDriver {
    private final ChromeOptions chromeOptions = new ChromeOptions();
    public final String DEFAULT_URL = "https://rozetka.com.ua/";
    public final String cfClearanceCookie = "3YPxj0L29vz266TBp.9x6J9LQI8NDgXl7jZt7z_OfXI-1701716896-0-1-8ee6ba3e.e04c223a.d9e7e5de-0.2.1701716896";

    @BeforeMethod
    public void selenideSetUp() {
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-automation");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("disable-infobars");
//        chromeOptions.addArguments("--headless");
        Configuration.browserSize = "3200х2000";
        Configuration.timeout = 5000;
        Configuration.browserCapabilities = chromeOptions;
    }

    public void changeCFCookie(String value) {
        Cookie cookie = new Cookie("cf_clearance", value);
        getWebDriver().manage().deleteCookieNamed("cf_clearance");
        getWebDriver().manage().addCookie(cookie);
        getWebDriver().navigate().refresh();
    }

    public void setProxy(String proxyIp) {
        try {
            Proxy proxy = new Proxy();
            String[] myProxyIp = proxyIp.split(":");
            proxy.setHttpProxy(myProxyIp[0]);
            proxy.setSslProxy(myProxyIp[1]);
            this.chromeOptions.setCapability("proxy", proxy);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void switchHandles(WebDriver driver, int windowNumber){
        List<String> listHandles = new ArrayList<>(driver.getWindowHandles());
        if (windowNumber < listHandles.size()) {
            driver.switchTo().window(listHandles.get(windowNumber));
        } else {
            throw new RuntimeException("This Window Handle is not Exist. Select correct window");
        }
    }
    public static void scrollToElement(WebDriver driver, WebElement webElement, boolean intoView){
        ((JavascriptExecutor) driver).executeScript(String.format("arguments[0].scrollIntoView(%s)", intoView), webElement);
    }
}
