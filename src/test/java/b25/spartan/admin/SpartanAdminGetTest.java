package b25.spartan.admin;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class SpartanAdminGetTest {

    //beforeAll is the same thing with beforeClass in testng
    @BeforeAll
    public static void init(){
        RestAssured.baseURI ="http://44.201.121.105:7000";
    }

    @Test
    public void getAllSpartan(){
            given()
                    .accept(ContentType.JSON)
                    .and()
                    .auth().basic("admin","admin")
            .when()
                    .get("/api/spartans")
            .then()
                    .statusCode(200)
                    .and()
                    .contentType(ContentType.JSON);
    }


}
