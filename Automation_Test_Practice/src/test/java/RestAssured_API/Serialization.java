package RestAssured_API;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Serialization {

    @Test
    public void serialize(){

        Map<String,String> values = new HashMap<String,String>();
        values.put("name","vinoth");
        values.put("Job","Manager");

        RestAssured
                .given()
                .baseUri("https://reqres.in/api")
                .header("Content-type","application/json")
                .header("x-api-key", "reqres-free-v1")
                .body(values)
                .log()
                .all()
                .when()
                .post("/users?page=2")
                .then()
                .log()
                .all();



    }
}
