package apiTests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.equalTo;

import static builders.PostPetGenerator.createDefaultPet;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class PetStoreApiTests {

    @Test
    public void postNewPetWithCode200() {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet")
                .contentType(JSON)
                .accept(JSON)
                .body(createDefaultPet())

                .when()
                .post()

                .then()
                .statusCode(200)
                .assertThat().body("name", equalTo(createDefaultPet().getName()))
                .assertThat().body("id", equalTo(createDefaultPet().getId()))
                .assertThat().body("status", equalTo(createDefaultPet().getStatus()))
                .log().all();
    }

    @Test
    public void GetPetByIdWithCode200() {
        int petId = 10;
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/{Id}")
                .pathParam("Id", petId)
                .accept(JSON)
                .contentType(JSON)

                .when()
                .get()

                .then()
                .statusCode(200)
                .assertThat().body("id", equalTo(petId))
                .log().all();
    }

    @Test
    public void DeletePetByIdWithCode200() {
        int petId = 2;
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/{Id}")
                .pathParam("Id", petId)
                .header("api_key","special-key")
                .accept(JSON)
                .contentType(JSON)

                .when()
                .delete()

                .then()
                .statusCode(200)
                .body("code", equalTo(200))
                .assertThat().body("message", equalTo(String.valueOf(petId)))
                .log().all();
    }

    @Test //ВСЕГДА НЕУСПЕШНЫЙ (ХЗ КАК 400 ПОЛУЧИТЬ)
    public void LogIntoTheSystemWithError400() {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/user/login")
                .queryParam("username", "&^$BUhnv78043tmkldfsшовашг88")
                .queryParam("password", "ГРИМНКтyh8f76342yh*(&@$&*H")
                .accept(JSON)
                .contentType(JSON)

                .when()
                .get()

                .then()
                .statusCode(400)
                .header("x-expires-after", nullValue())
                .header("x-rate-limit", nullValue())
                .log().all();
    }
}
