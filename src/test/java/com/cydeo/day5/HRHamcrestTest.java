package com.cydeo.day5;

import com.cydeo.utilities.HrTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class HRHamcrestTest extends HrTestBase {

    @DisplayName("GET request to Employees IT_PROG endpoint and chaining")
    @Test
    public void test1(){
        //TASK
        //send a get request to emplyoees endpoint with query parameter job_id IT_PROG
        //verify status code and content type
        //verify each job_id is IT_PROG
        //verify first names are .... (find proper method to check list against list)
        //verify emails without checking order (provide emails in different order,just make sure it has same emails)

        //expected names
        List<String> names = Arrays.asList("Alexander","Bruce","David","Valli","Diana");





    }
}
