package lesson19;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @DataProvider(name = "SetBrowser")
    public Object[][] myData(){
        return new Object[][]{{"chrome, 70.0: autodoc.de"},
                {"safari, 55.0 : autodoc.ko"},
                {"safari, 23.0 : autoteile.de"}};
    }

    @Test(dataProvider = "SetBrowser")
    public void myTest(String data){
        String[] myData = data.split(":");

        System.out.println(myData[0]);
        System.out.println(myData[1]);
    }
}
