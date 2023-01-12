package controllers.password;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.*;

public class PasswordControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void validateRequestWithoutPassword() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/passwords");

        Result result = route(app, request);
        assertEquals(BAD_REQUEST, result.status());
    }

    @Test
    public void validateRequestWithInvalidPassword() {
        String password = "AbTp9!foA";

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/passwords")
                .bodyJson(Json.toJson(password));


        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void validateRequestWithValidPassword() {
        String password = "AbTp9!fok";

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/passwords")
                .bodyJson(Json.toJson(password));


        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

}
