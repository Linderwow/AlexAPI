package com.cydeo.day3;

import com.cydeo.utilities.HrTestBase;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class HRApiTestsWithParams extends HrTestBase {


        @Test
        public void test1(){
            Response response = get("/regions");

            response.prettyPrint();

        }

       /*
        Given accept type is Json
        And parameters: q = {"region_id":2}
        When users sends a GET request to "/countries"
        Then status code is 200
        And Content type is application/json
        And Payload should contain "United States of America"
     */

}
