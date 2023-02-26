package APITestsNewPost;

import io.restassured.http.ContentType;
import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import java.util.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AddressDirectoryTests extends BaseClassAPI {

    @Test
    public void checkedThatSuccess() {
        String API_key = "ce19e86ede037df124691dca003d46ba";
        Map<String, Object> reqBody = new HashMap<>();
        Map<Object, Object> methodProperties = new HashMap<>();
        methodProperties.put("FindByString", "Чернігів");
        methodProperties.put("Warehouse", 1);
        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .when()
                .get()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkedThatDescriptionIsCorrect() {
        String API_key = "ce19e86ede037df124691dca003d46ba";
        Map<String, Object> reqBody = new HashMap<>();
        Map<String, Object> methodProperties = new HashMap<>();
        methodProperties.put("FindByString", "Чернігів");
        methodProperties.put("Warehouse", 1);
        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .when()
                .get()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("success", equalTo(true))
                .body("data[0].Description", equalToObject("Чернігів"))
                .extract()
                .response();
    }

    @Test
    public void invalidData() {
        String API_key = "ce19e86ede037df124691dca003d46ba";
        Map<String, Object> reqBody = new HashMap<>();
        Map<String, Object> methodProperties = new HashMap<>();
        methodProperties.put("FindByString", ",");
        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .when()
                .get()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .body("success", equalTo(false))
                .extract()
                .response();
    }


}
