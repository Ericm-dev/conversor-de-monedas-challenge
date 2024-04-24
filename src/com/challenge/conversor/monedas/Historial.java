package com.challenge.conversor.monedas;
import java.util.ArrayList;

public class Historial {
    
    private ArrayList<String> miHistorial;

    public Historial() {
        this.miHistorial = new ArrayList<>();
    }

    public void addHistorial(String convertir) {
        this.miHistorial.add(convertir);
    }

    public void mostrarHistorial() {
        for (String moneda : this.miHistorial) {
            System.out.println(moneda);
        }
    }


    
}
