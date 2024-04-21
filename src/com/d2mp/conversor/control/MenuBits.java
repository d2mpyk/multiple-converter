package com.d2mp.conversor.control;

import com.d2mp.conversor.enums.UnidadDatos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuBits implements Menu{
    public MenuBits() {
    }
    @Override
    public int showMenu() {
        int opcion = 0;
        int opcionTarget = 0;
        double valor;
        UnidadDatos unidadDatos = UnidadDatos.BIT;
        String line = "\n|--------------------------------------------------|\n";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("%s| Bienvenido al Convertidor de Unidades de Datos%s", line, line);
            System.out.printf("| Medidas Disponibles para la Conversión%s", line);
            System.out.printf("| 1.-  Bits      (b)\n"+
                              "| 2.-  Kilobits  (Kb)\n"+
                              "| 3.-  Megabits  (Mb)\n"+
                              "| 4.-  Gigabits  (Gb)\n"+
                              "| 5.-  Terabits  (Tb)\n"+
                              "| 6.-  Petabits  (Pb)\n"+
                              "| 7.-  Exabits   (Eb)\n"+
                              "| 8.-  Bytes     (B)\n"+
                              "| 9.-  KiloBytes (KB)\n"+
                              "| 10.- MegaBytes (MB)\n"+
                              "| 11.- GigaBytes (GB)\n"+
                              "| 12.- TeraBytes (TB)\n"+
                              "| 13.- PetaBytes (PB)\n"+
                              "| 14.- ExaBytes  (EB)\n"+
                              "| \n"+
                              "| NOTA: 1 Byte = 8 bits\n"+
                              "|       El tamaño de los archivos\n"+
                              "|       Se mide en Bytes. (500 MB)\n"+
                              "|       La transferencia de Datos\n"+
                              "|       Se mide en bits   (500 Mb/s)\n"+
                              "| \n"+
                              "| 90.- Regresar al menú Principal%s", line);
            System.out.print("\nEscoja la medida fuente o presione 90 para salir: ");
            opcion = scanner.nextInt();
            if (opcion != 90){
                System.out.print("Escoja la medida destino: ");
                opcionTarget = scanner.nextInt();
                System.out.print("Indique la cantidad a convertir: ");
                valor = scanner.nextDouble();
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.print("\nError: ");
        }

        switch (opcion){
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
            case 13:
            case 14:
                try {
                    System.out.printf("%s| Convirtiendo de %s a %s...", line, opcion, opcionTarget);
                } catch (NumberFormatException e) {
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
