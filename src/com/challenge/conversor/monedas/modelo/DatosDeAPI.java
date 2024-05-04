package com.challenge.conversor.monedas.modelo;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public record DatosDeAPI(

    @SerializedName("conversion_rates") Map<String, Double> conversionRates) {

    public Double getMoneda(String moneda) {
        return conversionRates.getOrDefault(moneda, 0.0);
    }

    public Double calculoAOtraDivisa(float cantidad, String moneda) {
        return cantidad * getMoneda(moneda);
    }
}
