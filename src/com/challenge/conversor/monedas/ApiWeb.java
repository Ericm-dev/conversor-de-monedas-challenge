package com.challenge.conversor.monedas;
public class ApiWeb {

    private String url;
    private String apiKey;
    private String complemento;
    private String moneda;

    public ApiWeb() {
    }

    public ApiWeb(String url, String apiKey, String complemento, String moneda) {
        this.url = url;
        this.complemento = complemento;
        this.apiKey = apiKey;
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return url + apiKey + complemento + moneda;
    }

    
}
