package lesson31.yearSort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class SortedYear {
    private final String BASE_URL = "https://reqres.in/";
    @Test
    public void testSortedYear(){
        installSpec(requestSpecification(BASE_URL), responseSpecification(200));

        List<YearData> yearDataList = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", YearData.class);

        List<String> actualYear = yearDataList.stream().map(YearData::getYear).collect(Collectors.toList());
        List<String> expectedYear = actualYear.stream().sorted().collect(Collectors.toList());

        Assert.assertEquals(actualYear, expectedYear);

    }
}
