package homeworks.homework31;


import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;
import static org.hamcrest.Matchers.notNullValue;

public class TestCreatingUser {
    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testDeletingUser() {
        installSpec(requestSpecification(BASE_URL), responseSpecification(201));
        RegisterPojo registerPojo = new RegisterPojo("morpheus", "leader");
        SuccessRegPojo successUserRegPojo = given()
                .when()
                .body(registerPojo)
                .post("api/users")
                .then().log().all()
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .extract().as(SuccessRegPojo.class);

        Assert.assertEquals(registerPojo.getName(), successUserRegPojo.getName());
        Assert.assertEquals(registerPojo.getJob(), successUserRegPojo.getJob());
    }
}
