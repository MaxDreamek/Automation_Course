package lesson32;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForMvnSureFireFail {
    @Test
    @Flaky()
    @Owner("Max")
    @Lead("Oleg")
    @Description("Second test with FirePlugin")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check Out")
    @Story("User should choose Flexible time")
    @Issue("NATD-...")
    @TmsLink("tc-1")
    @Link(name = "requirements of API", url = "https://www.somerequire.com", type = "API")
    public void testSureFirePlugin(){
        Assert.fail("Message for test ");
    }
}
