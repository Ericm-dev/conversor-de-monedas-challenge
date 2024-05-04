package com.challenge.conversor.monedas.funcionalidades;

import java.util.ArrayList;

public class Historial {
        private ArrayList<String> miHistorial;

    public Historial() {
        this.miHistorial = new ArrayList<>();
    }

    public void anadir(String resutado) {
        this.miHistorial.add(resutado);
    }

    public void mostrarHistorial() {
        for (String moneda : this.miHistorial) {
            System.out.println(moneda);
        }
    }
}
