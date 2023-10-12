package ru.netology;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
class postmanEchoTest {

    @Test
    void shouldTestSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Добрый день")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Добрый день"))
        ;
    }


    @Test
    void shouldTestPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello world")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello world"))
        ;
    }
}