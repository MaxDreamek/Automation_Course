package init;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;



import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideWebDriver {
    private final ChromeOptions chromeOptions = new ChromeOptions();
    public final String DEFAULT_URL = "https://rozetka.com.ua/";
    public final String cfClearanceCookie = "L_7De6r6rTXGNt6ZjrC06QMzr6hhaDgrbkqRKeuJbrc-1701883475-0-1-ded45ae0.1e1a7275.89d50500-0.2.1701883475";

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
    public static void scrollToElement(WebElement webElement, boolean intoView){
        executeJavaScript(String.format("arguments[0].scrollIntoView(%s)", intoView), webElement);
    }
    public static void jsClick(WebElement element){
        executeJavaScript("arguments[0].click()",element);
    }
}
