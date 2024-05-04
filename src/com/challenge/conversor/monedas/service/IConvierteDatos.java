package com.challenge.conversor.monedas.service;

public interface IConvierteDatos {
    <T> T convertirDatosAObjeto(String json, Class<T> clase);
}
