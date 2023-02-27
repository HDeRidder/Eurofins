package tests;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class patchUserTest_27_02_23 {
    public static void main(String[] args) throws UnirestException {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Harold De Ridder");

        HttpResponse<String> response = Unirest.patch("https://reqres.in/api/users/5")
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .asString();

        int statusCode = response.getStatus();
        String responseBody = response.getBody();

        System.out.println("Response Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    @Test
    void testPatchUser() throws UnirestException {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Harold De Ridder");

        HttpResponse<String> response = Unirest.patch("https://reqres.in/api/users/5")
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .asString();

        int statusCode = response.getStatus();
        String responseBody = response.getBody();

        assertEquals(200, statusCode);
        assertTrue(responseBody.contains("Harold De Ridder"));
    }
}
