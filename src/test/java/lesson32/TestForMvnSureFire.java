package lesson32;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class TestForMvnSureFire {
    @Test
    @Flaky()
    @Owner("Alex")
    @Lead("Oleg")
    @Description("First test with FirePlugin")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check In - Check Out")
    @Story("User should choose Flexible Dates")
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void testSureFirePlugin(){
        System.out.println("Message for test ");
    }

}
