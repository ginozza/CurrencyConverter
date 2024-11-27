package com.aluracursos.converter.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiHttpClient {
    public static String FetchHTTP(String uriResource) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uriResource))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String responseBody = response.body();

            if (statusCode == 200) {
                return responseBody;
            } else {
                System.err.println("Failure in HTTP request. Status code: " + statusCode);
                System.err.println("Response body: " + responseBody);
                return null;
            }
        } catch (IOException e) {
            System.err.println("E/S error during HTTP request: " + e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("Interrupted HTTP request: " + e.getMessage());
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.err.println("Exception in HTTP request: " + e.getMessage());
            e.printStackTrace();
        }

        return null;
    }
}