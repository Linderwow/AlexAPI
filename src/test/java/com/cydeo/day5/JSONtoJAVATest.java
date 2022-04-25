package com.cydeo.day5;

import com.cydeo.utilities.SpartanTestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class JSONtoJAVATest extends SpartanTestBase {

    @DisplayName("GET one Spartan and deserialize to MAP")
    @Test
    public void test1(){

    Response response = given()
                    .accept(ContentType.JSON)
                    .pathParam("id",15)
            .when()
                    .get("/api/spartans/{id}")
            .then()
                    .statusCode(200)
                    .extract().response();

    //get the json body and convert it to java map

        Map<String,Object> jsonMap = response.as(Map.class);



    }

}
