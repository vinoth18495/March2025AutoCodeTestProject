package RestAssured_API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class GetAllEmployees {

    @Test(enabled = true)
    public void getallemployees(){

        RestAssured.baseURI="https://reqres.in/api";

        RequestSpecification Request = RestAssured.given()
                .header("x-api-key", "reqres-free-v1");

        Response  response= Request.request(Method.GET, "/users?page=1");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusLine());

//        Request.request(Method.GET, "/api/users?page=2")
//                .then()
//                .assertThat()
//                .statusCode(200) // Validate status code
//                .body("page", equalTo(2)) // Validate page number
//                .body("data[0].id", equalTo(7)); // Validate first user's ID

    }


 }




