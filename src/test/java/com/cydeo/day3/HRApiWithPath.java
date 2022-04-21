package com.cydeo.day3;

import com.cydeo.utilities.HrTestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class HRApiWithPath extends HrTestBase {

    @DisplayName("GET request to countries with Path method")
    @Test
    public void test1(){
        Response response = given()
                .accept(ContentType.JSON)
                .queryParam("q", "{\"region_id\":2}")
                .when()
                .get("/countries");

        //response.prettyPrint();
        //print limit result
        System.out.println(response.path("limit").toString());
        //print hasMore
        System.out.println(response.path("hasMore").toString());
        //print second country id
        System.out.println(response.path("items[1].country_id").toString());
        //print 4th element country name
        System.out.println(response.path("items[3].country_name").toString());

        //get me all country names

    }
}
