package com.d2mp.conversor.control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTemperaturas implements Menu{
    public MenuTemperaturas() {
    }
    @Override
    public int showMenu() {
        int opcion = 0;
        int opcionMenu;
        double valor;
        Temperaturas temperaturas = new Temperaturas();
        String line = "\n|--------------------------------------------------|\n";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(line+"| Bienvenido al Convertidor de Temperaturas"+line);
            System.out.print("| 8.- Convertir Temperaturas\n| 9.- Regresar al Menu Principal"+line);
            System.out.print("\nEscoja una opción: ");
            opcion = scanner.nextInt();
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.print("\nError: ");
        }

        switch (opcion) {
            case 8:
                try {
                    System.out.print(line+"| Conversiones Disponibles"+line);
                    System.out.println("| 1.- Convertir de ºCelsius a ºFarenheit\n" +
                                       "| 2.- Convertir de ºFarenheit a ºCelsius\n" +
                                       "| 3.- Convertir de ºCelsius a ºKelvin\n" +
                                       "| 4.- Convertir de ºKelvin a ºCelsius\n" +
                                       "| 5.- Convertir de ºFarenheit a ºKelvin\n" +
                                       "| 6.- Convertir de ºKelvin a ºFarenheit\n" +
                                       "| 9.- Regresar al Menú Anterior"+line);
                    System.out.print("Escoja una opción: ");
                    opcionMenu = scanner.nextInt();

                    switch (opcionMenu) {
                        case 1:
                            try {
                                System.out.print("Indique el valor de la temperatura a convertir: ");
                                valor = scanner.nextDouble();
                                System.out.print(line+"| Convirtiendo de ºCelsius a ºFarenheit"+line);
                                System.out.print("| La temperatura en: "+valor+"°C a Farenheit es: "
                                        +temperaturas.CelsiusToFarenheith(valor)+"°F"+line);
                            } catch (NumberFormatException e){
                                System.out.println("Por favor ingrese solo números");
                            }
                            break;
                        case 2:
                            try {
                                System.out.print("Indique el valor de la temperatura a convertir: ");
                                valor = scanner.nextDouble();
                                System.out.print(line+"| Convirtiendo de ºFarenheit a ºCelsius"+line);
                                System.out.print("| La temperatura en: "+valor+"°F a Celsius es: "
                                        +temperaturas.FarenheitToCelsius(valor)+"°C"+line);
                            } catch (NumberFormatException e){
                                System.out.println("Por favor ingrese solo números");
                            }
                            break;
                        case 3:
                            try {
                                System.out.print("Indique el valor de la temperatura a convertir: ");
                                valor = scanner.nextDouble();
                                System.out.print(line+"| Convirtiendo de ºCelsius a ºKelvin"+line);
                                System.out.print("| La temperatura en: "+valor+"°C a Kelvin es: "
                                        +temperaturas.CelsiusToKelvin(valor)+"°K"+line);
                            } catch (NumberFormatException e){
                                System.out.println("Por favor ingrese solo números");
                            }
                            break;
                        case 4:
                            try {
                                System.out.print("Indique el valor de la temperatura a convertir: ");
                                valor = scanner.nextDouble();
                                System.out.print(line+"| Convirtiendo de ºKelvin a ºCelsius"+line);
                                System.out.print("| La temperatura en: "+valor+"°K a Celsius es: "
                                        +temperaturas.KelvinToCelsius(valor)+"°C"+line);
                            } catch (NumberFormatException e){
                                System.out.println("Por favor ingrese solo números");
                            }
                            break;
                        case 5:
                            try {
                                System.out.print("Indique el valor de la temperatura a convertir: ");
                                valor = scanner.nextDouble();
                                System.out.print(line+"| Convirtiendo de ºFarenheit a ºKelvin"+line);
                                System.out.print("| La temperatura en: "+valor+"°F a Kelvin es: "
                                        +temperaturas.FarenheitToKelvin(valor)+"°K"+line);
                            } catch (NumberFormatException e){
                                System.out.println("Por favor ingrese solo números");
                            }
                            break;
                        case 6:
                            try {
                                System.out.print("Indique el valor de la temperatura a convertir: ");
                                valor = scanner.nextDouble();
                                System.out.print(line+"| Convirtiendo de ºKelvin a ºFarenheit"+line);
                                System.out.print("| La temperatura en: "+valor+"°K a Farenheit es: "
                                        +temperaturas.KelvinToFarenheit(valor)+"°F"+line);
                            } catch (NumberFormatException e){
                                System.out.println("Por favor ingrese solo números");
                            }
                            break;
                        case 9:
                            //System.out.println("\n   ¡Regresando al Menú del Convertidor de Temperaturas!\n");
                            break;
                        default:
                            System.out.println("Opción incorrecta intente nuevamente\n");
                            break;
                    }
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.print("\nError: Valor incorrecto, intente de nuevo\n");
                }
                break;
            case 9:
                //System.out.println("\n   ¡Regresando al Menú Principal!\n");
                break;
            default:
                System.out.println("Opción incorrecta intente de nuevo");
                opcion = 0;
                break;
        }
        return opcion;
    }
}
