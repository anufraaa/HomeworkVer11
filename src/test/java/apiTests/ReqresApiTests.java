package apiTests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pojo.GetColorsData;
import pojo.GetUsersData;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.example.constants.ReqresConstants.*;

public class ReqresApiTests {

    @Test
    public void checkColorYear() {
        List<GetColorsData> colors = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(REQRES_BASE_URL)
                .basePath(GET_API_UNKNOWN)

                .when()
                .get()

                .then()
                .log().body()
                .extract()
                .jsonPath()
                .getList("data", GetColorsData.class);

        colors.forEach(color -> Assertions.assertTrue(color.getYear() >= 2000));
    }

    @Test
    public void checkUserAvatar() {
        List<GetUsersData> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(REQRES_BASE_URL)
                .basePath(GET_API_USERS)

                .when()
                .get()

                .then()
                .log().body()
                .extract()
                .jsonPath()
                .getList("data", GetUsersData.class);

        users.forEach(user -> Assertions.assertTrue(user.getAvatar().contains("https://reqres.in")));
    }
}
