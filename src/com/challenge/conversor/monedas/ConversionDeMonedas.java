package com.challenge.conversor.monedas;
import com.google.gson.JsonObject;

public class ConversionDeMonedas {
    
    ConsultarApi consultarApi = new ConsultarApi();
    
    // //Obtener valor especificos dentro de los datos de la Api, Propiedades del
    // Json, accedemos a la propieda tasa de conversion
    public float ConversionDeMoneda(String json, String moneda, float cantidad) {
        JsonObject miObjetoJson = consultarApi.convertirDatosAJson(json);
        String memberName = "conversion_rates";
        String memberName2 = moneda;
        // Calcular
        float valordeMonedaEnApi = miObjetoJson.getAsJsonObject(memberName).get(memberName2).getAsFloat();
        float resultado = cantidad * valordeMonedaEnApi;
        return resultado;
    }

}
