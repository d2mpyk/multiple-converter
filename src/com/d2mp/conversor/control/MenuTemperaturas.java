package com.d2mp.conversor.control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTemperaturas implements Menu {
    public MenuTemperaturas() {
    }

    @Override
    public int showMenu() {
        int opcion = 0;
        double valor;
        Temperaturas temperaturas = new Temperaturas();
        String line = "\n|-------------------------------------------------------|\n";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("%s| Bienvenido al Convertidor de Temperaturas%s", line, line);
            System.out.printf("| Conversiones Disponibles%s", line);
            System.out.printf("| 1.- Convertir de ºCelsius a ºFarenheit\n" +
                            "| 2.- Convertir de ºFarenheit a ºCelsius\n" +
                            "| 3.- Convertir de ºCelsius a ºKelvin\n" +
                            "| 4.- Convertir de ºKelvin a ºCelsius\n" +
                            "| 5.- Convertir de ºFarenheit a ºKelvin\n" +
                            "| 6.- Convertir de ºKelvin a ºFarenheit\n" +
                            "| \n" +
                            "| 90.- Regresar al Menú Anterior%s", line);
            System.out.print("\nEscoja una opción: ");
            opcion = scanner.nextInt();
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.print("\nError: ");
        }

        switch (opcion) {
            case 1:
                try {
                    System.out.print("Indique el valor de la temperatura a convertir: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%s| Convirtiendo de ºCelsius a ºFarenheit%s", line, line);
                    System.out.printf("| La temperatura de: %5.2f°C a Farenheit es: %5.2f°F%s",
                            temperaturas.round2Decimal(valor), temperaturas.CelsiusToFarenheith(temperaturas.round2Decimal(valor)), line);
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Por favor ingrese solo números");
                }
                break;
            case 2:
                try {
                    System.out.print("Indique el valor de la temperatura a convertir: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%s| Convirtiendo de ºFarenheit a ºCelsius%s", line, line);
                    System.out.printf("| La temperatura de: %5.2f°F a Celsius es: %5.2f°C%s",
                            temperaturas.round2Decimal(valor), temperaturas.FarenheitToCelsius(temperaturas.round2Decimal(valor)), line);
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Por favor ingrese solo números");
                }
                break;
            case 3:
                try {
                    System.out.print("Indique el valor de la temperatura a convertir: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%s| Convirtiendo de ºCelsius a ºKelvin%s", line, line);
                    System.out.printf("| La temperatura de: %5.2f°C a Kelvin es: %5.2f°K%s",
                            temperaturas.round2Decimal(valor), temperaturas.CelsiusToKelvin(temperaturas.round2Decimal(valor)), line);
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Por favor ingrese solo números");
                }
                break;
            case 4:
                try {
                    System.out.print("Indique el valor de la temperatura a convertir: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%s| Convirtiendo de ºKelvin a ºCelsius%s", line, line);
                    System.out.printf("| La temperatura de: %5.2f°K a Celsius es: %5.2f°C%s",
                            temperaturas.round2Decimal(valor), temperaturas.KelvinToCelsius(temperaturas.round2Decimal(valor)), line);
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Por favor ingrese solo números");
                }
                break;
            case 5:
                try {
                    System.out.print("Indique el valor de la temperatura a convertir: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%s| Convirtiendo de ºFarenheit a ºKelvin%s", line, line);
                    System.out.printf("| La temperatura de: %5.2f°F a Kelvin es: %5.2f°K%s",
                            temperaturas.round2Decimal(valor), temperaturas.FarenheitToKelvin(temperaturas.round2Decimal(valor)), line);
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Por favor ingrese solo números");
                }
                break;
            case 6:
                try {
                    System.out.print("Indique el valor de la temperatura a convertir: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%s| Convirtiendo de ºKelvin a ºFarenheit%s", line, line);
                    System.out.printf("| La temperatura de: %5.2f°K a Farenheit es: %5.2f°F%s",
                            temperaturas.round2Decimal(valor), temperaturas.KelvinToFarenheit(temperaturas.round2Decimal(valor)), line);
                } catch (NumberFormatException | InputMismatchException e) {
                    System.out.println("Por favor ingrese solo números");
                }
                break;
            case 90:
                //System.out.println("\n   ¡Regresando al Menú del Convertidor de Temperaturas!\n");
                break;
            default:
                System.out.println("Opción incorrecta intente nuevamente\n");
                break;
        }
        return opcion;
    }
}
