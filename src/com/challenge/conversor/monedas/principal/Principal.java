package com.challenge.conversor.monedas.principal;

import java.util.Scanner;

import com.challenge.conversor.monedas.funcionalidades.FechasDeHistorial;
import com.challenge.conversor.monedas.funcionalidades.Historial;
import com.challenge.conversor.monedas.modelo.DatosDeAPI;
import com.challenge.conversor.monedas.service.ConsumoAPI;
import com.challenge.conversor.monedas.service.ConvierteDatosGson;

public class Principal {
    private Scanner entrada = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatosGson convierteDatos = new ConvierteDatosGson();
    private FechasDeHistorial fechasDeHistorial = new FechasDeHistorial();
    private Historial historial = new Historial();
    private String resultado;
    private String fechaActual;
    private float cantidadDinero;
    private String json;
    private DatosDeAPI datos;
    private Double calculo;
    private int opcion;

    private String menu = """
            ************************************************
            ************************************************
            **   <<Bienvenido al Conversor de monedas>>   **
            **                                            **
            **   1) Dólar >>>> a >>>> Peso argentino      **
            **   2) Peso >>>> a >>>> argentino =>> Dólar  **
            **   3) Dólar >>>> a >>>> Real brasileño      **
            **   4) Real >>>> a >>>> Dólar                **
            **   5) Dólar >>>> a >>>> Peso colombiano     **
            **   6) Peso colombiano >>>> a >>>> Dólar     **
            **   7) Salir                                 **
            **                                            **
            ************************************************
            ************************************************
            """;

    public void muestraElMenu() {
        while (opcion != 7) {
            System.out.println("\n" + menu);
            System.out.println("Escriba una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    json = consumoAPI
                            .obtenerDatos("https://v6.exchangerate-api.com/v6/2eba093ef21570fbd0c47dd2/latest/USD");
                    datos = convierteDatos.convertirDatosAObjeto(json, DatosDeAPI.class);
                    calculo = datos.calculoAOtraDivisa(cantidadDinero, "ARS");
                    resultado = "El valor de " + cantidadDinero + " USD corresponde al valor final de =>>> " + calculo
                            + " ARS";
                    fechaActual = fechasDeHistorial.establecerFecha();
                    historial.anadir(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    json = consumoAPI
                            .obtenerDatos("https://v6.exchangerate-api.com/v6/2eba093ef21570fbd0c47dd2/latest/ARS");
                    datos = convierteDatos.convertirDatosAObjeto(json, DatosDeAPI.class);
                    calculo = datos.calculoAOtraDivisa(cantidadDinero, "USD");
                    resultado = "El valor de " + cantidadDinero + " ARS corresponde al valor final de =>>> " + calculo
                            + " USD";
                    fechaActual = fechasDeHistorial.establecerFecha();
                    historial.anadir(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 3:
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    json = consumoAPI
                            .obtenerDatos("https://v6.exchangerate-api.com/v6/2eba093ef21570fbd0c47dd2/latest/USD");
                    datos = convierteDatos.convertirDatosAObjeto(json, DatosDeAPI.class);
                    calculo = datos.calculoAOtraDivisa(cantidadDinero, "USD");
                    resultado = "El valor de " + cantidadDinero + " USD corresponde al valor final de =>>> " + calculo
                            + " BRL";
                    fechaActual = fechasDeHistorial.establecerFecha();
                    historial.anadir(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 4:
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    json = consumoAPI
                            .obtenerDatos("https://v6.exchangerate-api.com/v6/2eba093ef21570fbd0c47dd2/latest/BRL");
                    datos = convierteDatos.convertirDatosAObjeto(json, DatosDeAPI.class);
                    calculo = datos.calculoAOtraDivisa(cantidadDinero, "USD");
                    resultado = "El valor de " + cantidadDinero + " BRL corresponde al valor final de =>>> " + calculo
                            + " USD";
                    fechaActual = fechasDeHistorial.establecerFecha();
                    historial.anadir(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    json = consumoAPI
                            .obtenerDatos("https://v6.exchangerate-api.com/v6/2eba093ef21570fbd0c47dd2/latest/USD");
                    datos = convierteDatos.convertirDatosAObjeto(json, DatosDeAPI.class);
                    calculo = datos.calculoAOtraDivisa(cantidadDinero, "COP");
                    resultado = "El valor de " + cantidadDinero + " USD corresponde al valor final de =>>> " + calculo
                            + " COP";
                    fechaActual = fechasDeHistorial.establecerFecha();
                    historial.anadir(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 6:
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    json = consumoAPI
                            .obtenerDatos("https://v6.exchangerate-api.com/v6/2eba093ef21570fbd0c47dd2/latest/COP");
                    datos = convierteDatos.convertirDatosAObjeto(json, DatosDeAPI.class);
                    calculo = datos.calculoAOtraDivisa(cantidadDinero, "USD");
                    resultado = "El valor de " + cantidadDinero + " COP corresponde al valor final de =>>> " + calculo
                            + " USD";
                    fechaActual = fechasDeHistorial.establecerFecha();
                    historial.anadir(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 7:
                    opcion = 7;
                    break;
                default:
                    System.out.println("Opción no valida, verifique las opciones y vuelva a intentar.");
                    break;
            }
        }

        System.out.println();
        System.out.println("Historial de conversiones realizadas:");
        historial.mostrarHistorial();

        System.out.println();
        System.out.println("Programa finalizado, gracias por participar");
        entrada.close();
    }
}
