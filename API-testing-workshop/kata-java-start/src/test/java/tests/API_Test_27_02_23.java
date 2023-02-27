package tests;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class API_Test_27_02_23 {
        @Test
        public void testUser5Email() throws UnirestException {
            HttpResponse<JsonNode> response = Unirest.get("https://reqres.in/api/users/5")
                    .asJson();

            Assertions.assertEquals(200, response.getStatus());

            String email = response.getBody()
                    .getObject()
                    .getJSONObject("data")
                    .getString("email");

            Assertions.assertEquals("charles.morris@reqres.in", email);
        }


}

