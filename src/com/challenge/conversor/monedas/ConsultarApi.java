package com.challenge.conversor.monedas;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConsultarApi {

    //Obtención de datos en formato String
    public String ObtenerDatos(ApiWeb apiWeb) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            // Construyendo la solicitud HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiWeb.toString()))
                    .build();

            //Construimos el response
            HttpResponse<String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Datos de la Api convertidos a String
            String json = response.body();
            return json;

        } catch (Exception e) {
            System.out.println(e);
            return "No se pudieron obtener los datos.";
        }
    }

    //Datos de api converitdos a objeto Json
    public JsonObject convertirDatosAJson(String json) {
        Gson g = new Gson();
        JsonObject miJsonObject = g.fromJson(json, JsonObject.class);
        return miJsonObject;
    }

}
