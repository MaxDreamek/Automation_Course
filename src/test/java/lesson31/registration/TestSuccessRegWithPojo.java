package lesson31.registration;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.bouncycastle.cms.PasswordRecipientId;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestSuccessRegWithPojo {
    private final String BASE_URL = "https://reqres.in/";
    private final Integer EXPECTED_ID = 4;
    private final String EXPECTED_TOKEN = "QpwL5tke4Pnpja7X4";
    @Test
    public void testSuccessRegWithPojo(){
        installSpec(requestSpecification(BASE_URL), responseSpecification(200));
        RegisterPojo register = new RegisterPojo("eve.holt@reqres.in", "pistol");
        SuccessUserRegPojo successUserRegPojo = given()
                .body(register)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessUserRegPojo.class);
        Assert.assertEquals(successUserRegPojo.getId(), EXPECTED_ID);
        Assert.assertEquals(successUserRegPojo.getToken(), EXPECTED_TOKEN);
    }
}
