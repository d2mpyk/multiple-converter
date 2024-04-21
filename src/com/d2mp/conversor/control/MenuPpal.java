package com.d2mp.conversor.control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPpal implements Menu{
    public MenuPpal() {
    }

    @Override
    public int showMenu() {
        int opcion = 0;
        String line = "\n|------------------------------|\n";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("%s| Opciones de Conversión %s" +
                    "| 1.- Convertir Monedas\n" +
                    "| 2.- Convertir Temperaturas\n" +
                    "| 3.- Convertir Medidas\n" +
                    "| \n" +
                    "| 9.- Salir %s", line, line, line);
            System.out.print("\nEscoja una opción: ");
            opcion = scanner.nextInt();
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.print("\nError: ");
        }

        switch (opcion) {
            case 1:
                MenuMonedas menuMonedas = new MenuMonedas();
                int menu1 = 0;
                while(menu1 != 90){
                    menu1 = menuMonedas.showMenu();
                }
                break;
            case 2:
                MenuTemperaturas menuTemperaturas = new MenuTemperaturas();
                int menu2 = 0;
                while(menu2 != 90){
                    menu2 = menuTemperaturas.showMenu();
                }
                break;
            case 3:
                MenuBits menuBits = new MenuBits();
                int menu3 = 0;
                while(menu3 != 90){
                    menu3 = menuBits.showMenu();
                }
                break;
            case 9:
                System.out.println("\n   ¡Muchas gracias por usar este Convertidor, que tenga un buen día!\n");
                break;
            default:
                System.out.println("Opción incorrecta intente de nuevo");
                opcion = 0;
                break;
        }
        return opcion;
    }
}
