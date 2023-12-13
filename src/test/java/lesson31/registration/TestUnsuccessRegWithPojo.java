package lesson31.registration;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestUnsuccessRegWithPojo {
    private final String BASE_URL = "https://reqres.in/";
    private String EXPECTED_ERROR = "Missing password";

    @Test
    public void testSuccessRegWithPojo() {
        installSpec(requestSpecification(BASE_URL), responseSpecification(400));
        RegisterPojo register = new RegisterPojo("sydney@fife");
        UnsuccessUserRegPojo unsuccessUserRegPojo = given()
                .body(register)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(UnsuccessUserRegPojo.class);
        Assert.assertEquals(unsuccessUserRegPojo.getError(), EXPECTED_ERROR);
    }

}
