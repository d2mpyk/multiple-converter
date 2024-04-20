package com.d2mp.conversor.control;

import com.d2mp.conversor.model.Result;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMonedas implements Menu{
    public MenuMonedas() {
    }

    @Override
    public int showMenu() {
        int opcion = 0;
        int opcionBase;
        int opcionTarget;
        String monedaBase;
        String monedaTarget;
        BigDecimal monto;
        String line = "\n|----------------------------------------|\n";
        String line2 = "\n|-----------------------------------------------------------------|\n";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(line+"| Bienvenido al Convertidor de Monedas"+line);
            System.out.print("| 8.- Convertir Monedas\n| 9.- Regresar al Menu Principal"+line);
            System.out.print("\nEscoja una opción: ");
            opcion = scanner.nextInt();
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.print("\nError: ");
        }

        switch (opcion) {
            case 8:
                try {
                    System.out.print(line+"| Monedas Disponibles para la Conversión"+line);
                    System.out.println("| 1.-  ARS Argentine Peso\n" +
                                       "| 2.-  BRL Brazilian Real\n"+
                                       "| 3.-  BOB Bolivian Boliviano\n"+
                                       "| 4.-  CLP Chilean Peso\n" +
                                       "| 5.-  COP Colombian Peso\n"+
                                       "| 6.-  EUR Euro\n"+
                                       "| 7.-  MXN Mexican Peso\n" +
                                       "| 8.-  PEN Peruvian Sol\n"+
                                       "| 9.-  PYG Paraguayan Guaraní\n"+
                                       "| 10.- USD United States Dollar\n"+
                                       "| 11.- UYU Uruguayan Peso\n"+
                                       "| 12.- VES Venezuelan Bolívar Soberano"+line);
                    System.out.print("Indique el monto a convertir: ");
                    monto = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Escoja la moneda fuente: ");
                    opcionBase = scanner.nextInt();
                    System.out.print("Escoja la moneda destino: ");
                    opcionTarget = scanner.nextInt();

                    Search search = new Search();
                    monedaBase = search.optionToCode(opcionBase);
                    monedaTarget = search.optionToCode(opcionTarget);
                    Result result;
                    BigDecimal conversion;
                    if (opcionBase == 1 || opcionTarget == 1){
                        result = search.getConversion(monedaBase, monedaTarget);
                        conversion = monto.multiply(BigDecimal.valueOf(result.getConversion_rate()))
                                .setScale(2, RoundingMode.DOWN);
                    } else {
                        result = search.getConversion(monedaBase, "USD");
                        conversion = monto.multiply(BigDecimal.valueOf(result.getConversion_rate()))
                                .setScale(2, RoundingMode.DOWN);
                        result = search.getConversion("USD", monedaTarget);
                        conversion = conversion.multiply(BigDecimal.valueOf(result.getConversion_rate()))
                                .setScale(2, RoundingMode.DOWN);
                    }
                    System.out.println(line2+"| A la fecha: "+search.unixToDate(result.getTime_last_update_unix()));
                    System.out.println("| El resultado de convertir: "
                            +monto+" "+monedaBase
                            +" a "+result.getTarget_code()
                            +" es: "+conversion+line2);
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.print("\nError: Valor incorrecto, intente de nuevo\n");
                }
                break;
            case 9:
                //System.out.println("\n   ¡Saliendo del Convertidor de Monedas!\n");
                break;
            default:
                System.out.println("Opción incorrecta intente de nuevo");
                opcion = 0;
                break;
        }
        return opcion;
    }
}
