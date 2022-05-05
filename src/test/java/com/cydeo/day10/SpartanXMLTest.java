package com.cydeo.day10;


import com.cydeo.utilities.SpartanAuthTestBase;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class SpartanXMLTest extends SpartanAuthTestBase {

    //we will ask for xml result
    //assert status code
    //assert content type xml
    //verify first name

    @Test
    public void test1(){

            given()
                    .accept(ContentType.XML)
                    .and()
                    .auth().basic("admin","admin")
            .when()
                    .get("/api/spartans")
            .then()
                    .statusCode(200)
                    .and()
                    .contentType("application/xml")
                    .body("List.item[0].name",is("Rodolfo"))
                    .body("List.item[0].gender",is("Male"))
                    .log().all();

    }


}
