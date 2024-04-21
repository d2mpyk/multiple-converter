package com.d2mp.conversor.control;

import com.d2mp.conversor.model.Result;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMonedas implements Menu{
    public MenuMonedas() {
    }

    @Override
    public int showMenu() {
        int opcion = 0;
        int opcionTarget = 0;
        String monedaBase;
        String monedaTarget;
        double monto = 0;
        String line = "\n|----------------------------------------|\n";
        String line2 = "\n|-----------------------------------------------------------------|\n";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("%s| Bienvenido al Convertidor de Monedas%s", line, line);
            System.out.printf("| Monedas Disponibles para la Conversión%s", line);
            System.out.printf("| 1.-  ARS Argentine Peso\n" +
                            "| 2.-  BRL Brazilian Real\n"+
                            "| 3.-  BOB Bolivian Boliviano\n"+
                            "| 4.-  CLP Chilean Peso\n" +
                            "| 5.-  COP Colombian Peso\n"+
                            "| 6.-  EUR European Euro\n"+
                            "| 7.-  MXN Mexican Peso\n" +
                            "| 8.-  PEN Peruvian Sol\n"+
                            "| 9.-  PYG Paraguayan Guaraní\n"+
                            "| 10.- USD United States Dollar\n"+
                            "| 11.- UYU Uruguayan Peso\n"+
                            "| 12.- VES Venezuelan Bolívar Soberano\n"+
                            "| \n"+
                            "| 90.- Regresar al menú Principal%s", line);
            System.out.print("\nEscoja la moneda fuente o presione 90 para salir: ");
            opcion = scanner.nextInt();
            if (opcion != 90){
                System.out.print("Escoja la moneda destino: ");
                opcionTarget = scanner.nextInt();
                System.out.print("Indique el monto a convertir: ");
                monto = scanner.nextDouble();
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.print("\nError: ");
        }

        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                try {
                    Search search = new Search();
                    monedaBase = search.optionToCode(opcion);
                    monedaTarget = search.optionToCode(opcionTarget);
                    Result result;
                    double conversion;
                    System.out.printf("%s| Convirtiendo %5.2f %s a %s...", line2, monto, monedaBase, monedaTarget);
                    if (opcion == 10 || opcionTarget == 10){
                        result = search.getConversion(monedaBase, monedaTarget);
                        conversion = monto*result.getConversion_rate();
                    } else {
                        result = search.getConversion(monedaBase, "USD");
                        conversion = monto*result.getConversion_rate();
                        result = search.getConversion("USD", monedaTarget);
                        conversion = conversion*result.getConversion_rate();
                    }
                    System.out.printf("%s| A la fecha: %s", line2, search.unixToDate(result.getTime_last_update_unix()));
                    System.out.printf("%s| El resultado de convertir: %5.2f %s a %s es %5.2f %s%s",
                            line2, monto, monedaBase, result.getTarget_code(), conversion, result.getTarget_code(), line2);
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.print("\nError: Valor incorrecto, intente de nuevo\n");
                }
                break;
            case 90:
                //System.out.println("\n   ¡Saliendo del Convertidor de Monedas!\n");
            default:
                System.out.println("Opción incorrecta intente de nuevo");
                break;
        }
        return opcion;
    }
}
