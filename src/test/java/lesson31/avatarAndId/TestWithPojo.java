package lesson31.avatarAndId;

import io.restassured.http.ContentType;
import lesson31.Specification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import static io.restassured.RestAssured.given;
import static lesson31.Specification.requestSpecification;
import static lesson31.Specification.responseSpecification;


public class TestWithPojo {
    private final String BASE_URL = "https://reqres.in/";


    @Test
    public void testAvatarAndIdWithoutPojo() {
        Specification.installSpec(requestSpecification(BASE_URL),responseSpecification(200));
        List<UserData> userDataList = given()
                .when()
                .get( "api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
//        userDataList.stream().forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));

        userDataList.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(userDataList.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));

    }
}
