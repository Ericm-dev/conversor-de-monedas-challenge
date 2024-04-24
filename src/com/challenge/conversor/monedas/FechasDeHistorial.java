package com.challenge.conversor.monedas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechasDeHistorial {
    public String establecerFecha() {
        //Obtener fecha y hora en el sistema
        LocalDateTime fechaYHoraActual = LocalDateTime.now();
        //Formatear la fecha y hora
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaYHoraActual.format(formateador);
        return fechaFormateada;
    }
}
