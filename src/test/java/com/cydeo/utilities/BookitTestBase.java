package com.cydeo.utilities;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
public class BookitTestBase {

    public static RequestSpecification teacherReqSpec;

    @BeforeAll
    public static void init(){
        baseURI = ConfigurationReader.getProperty("base_url");

        teacherReqSpec = given()
                .header("Authorization",getTokenByRole("teacher"))
                .accept(ContentType.JSON)
                .log().all();
    }
    //create a method that returns Bearer+token based on provided role
    //teacher,student-member,student-leader
    //it will take info from configuration properties
    public static String getTokenByRole(String role) {


    }

    @AfterAll
    public static void close(){
        reset();
    }
}
