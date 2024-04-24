package com.challenge.conversor.monedas;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class RegistroDeTiempo {

    public static void main(String[] args) {
        // Crear fecha actual
        // LocalDate fechaActual = LocalDate.now();
        // Crea hora actual
        // LocalTime horaActual = LocalTime.now();
        // Crea una fecha y hora actual
        LocalDateTime fechaYHoraActual = LocalDateTime.now();

        //Formatear la fecha y hora
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaYHoraActual.format(formateador);
    

        System.out.println(fechaFormateada);

    }

}
