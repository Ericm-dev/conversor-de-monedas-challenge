package com.challenge.conversor.monedas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ApiWeb apiWeb;
        ConsultarApi consultarApi = new ConsultarApi();
        ConversionDeMonedas conversionDeMonedas = new ConversionDeMonedas();
        Historial historial = new Historial();
        FechasDeHistorial fechaDeHistorial = new FechasDeHistorial();

        String url = "https://v6.exchangerate-api.com/v6/";
        String apiKey = "2eba093ef21570fbd0c47dd2";
        String complemento = "/latest/";
        float cantidadDinero;
        int opcion = 0;
        String datosDeApi = "";
        float calculo;
        String resultado;
        String fechaActual;

        String menu = """
                *****Bienvenido al Conversor de monedas*****
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                """;

        while (opcion != 7) {
            System.out.println("\n"+menu);
            System.out.println("Escriba una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    apiWeb = new ApiWeb(url, apiKey, complemento, "USD");
                    datosDeApi = consultarApi.ObtenerDatos(apiWeb);
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    calculo = conversionDeMonedas.ConversionDeMoneda(datosDeApi, "ARS", cantidadDinero);
                    resultado = "El valor de " + cantidadDinero + " USD corresponde al valor final de =>>> " + calculo
                            + " ARS";
                    fechaActual = fechaDeHistorial.establecerFecha();
                    historial.addHistorial(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 2:
                    apiWeb = new ApiWeb(url, apiKey, complemento, "ARS");
                    datosDeApi = consultarApi.ObtenerDatos(apiWeb);
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    calculo = conversionDeMonedas.ConversionDeMoneda(datosDeApi, "USD", cantidadDinero);
                    resultado = "El valor de " + cantidadDinero + " ARS corresponde al valor final de =>>> " + calculo
                            + " USD";
                    fechaActual = fechaDeHistorial.establecerFecha();
                    historial.addHistorial(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 3:
                    apiWeb = new ApiWeb(url, apiKey, complemento, "USD");
                    datosDeApi = consultarApi.ObtenerDatos(apiWeb);
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    calculo = conversionDeMonedas.ConversionDeMoneda(datosDeApi, "BRL", cantidadDinero);
                    resultado = "El valor de " + cantidadDinero + " USD corresponde al valor final de =>>> " + calculo
                            + " BRL";
                    fechaActual = fechaDeHistorial.establecerFecha();
                    historial.addHistorial(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 4:
                    apiWeb = new ApiWeb(url, apiKey, complemento, "BRL");
                    datosDeApi = consultarApi.ObtenerDatos(apiWeb);
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    calculo = conversionDeMonedas.ConversionDeMoneda(datosDeApi, "USD", cantidadDinero);
                    resultado = "El valor de " + cantidadDinero + " BRL corresponde al valor final de =>>> " + calculo
                            + " USD";
                    fechaActual = fechaDeHistorial.establecerFecha();
                    historial.addHistorial(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 5:
                    apiWeb = new ApiWeb(url, apiKey, complemento, "USD");
                    datosDeApi = consultarApi.ObtenerDatos(apiWeb);
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    calculo = conversionDeMonedas.ConversionDeMoneda(datosDeApi, "COP", cantidadDinero);
                    resultado = "El valor de " + cantidadDinero + " USD corresponde al valor final de =>>> " + calculo
                            + " COP";
                    fechaActual = fechaDeHistorial.establecerFecha();
                    historial.addHistorial(fechaActual + " " + resultado);
                    System.out.println(resultado);
                    break;
                case 6:
                    apiWeb = new ApiWeb(url, apiKey, complemento, "COP");
                    datosDeApi = consultarApi.ObtenerDatos(apiWeb);
                    System.out.println("Escriba la cantidad de dinero que desea convertir: ");
                    cantidadDinero = entrada.nextFloat();
                    calculo = conversionDeMonedas.ConversionDeMoneda(datosDeApi, "USD", cantidadDinero);
                    resultado = "El valor de " + cantidadDinero + " COP corresponde al valor final de =>>> " + calculo
                            + " USD";
                    fechaActual = fechaDeHistorial.establecerFecha();
                    historial.addHistorial(fechaActual + " " + resultado);
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
