package com.challenge.conversor.monedas.service;

import com.google.gson.Gson;

public class ConvierteDatosGson implements IConvierteDatos{

    @Override
    public <T> T convertirDatosAObjeto(String json, Class<T> clase) {
        Gson gson = new Gson();
        return gson.fromJson(json, clase);
    }

}
