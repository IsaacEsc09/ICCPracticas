
package icc;

import java.util.Scanner;
import icc.colors.Colors;

public class Prueba {

    public static int getInt(String mensaje, String error, int min, int max) {
        int val;
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println(mensaje);
            if (scn.hasNextInt()) {
                val = scn.nextInt();
                // (-infinito, min) || (max, infinito)
                if (val < min || max < val) {
                    System.out.println(error);
                } else {
                    return val;
                }
            } else {
                scn.next();
                System.out.println(error);
            }
        }
    }

    public static double getDouble(String mensaje, String error, double min, double max) {
        double val;
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println(mensaje);
            if (scn.hasNextDouble()) {
                val = scn.nextDouble();
                if (val < min || max < val) {
                    System.out.println(error);
                } else {
                    return val;
                }
            } else {
                scn.next();
                System.out.println(error);
            }
        }
    }

    public static double celsiusF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String args[]) {
        int aux;

        do{

            aux = getInt("Este programa realiza la conversión entre grados Celsius y grados Fahrenheit.\n1. Celsius a Fahrenheit.\n2. Fahrenheit a Celsius.\n0. Salir.\nEscoge una opción.",
                    "Ingresa una opción válida (0, 1, 2).", 0, 2);

            switch (aux) {
                case 1:
                    try {
                        double c = getDouble("Ingresa los grados en Celsius:", "Ingresa un valor válido.", -273.15, Double.MAX_VALUE);
                        double f = celsiusF(c);
                        System.out.println(c + " grados Celsius son equivalentes a " + f + " grados Fahrenheit.");
                    } catch (Exception e) {
                        System.out.println("Error durante la conversión: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        double f = getDouble("Ingresa los grados en Fahrenheit:", "Ingresa un valor válido.", -459.67, Double.MAX_VALUE);
                        double c = fahrenheitC(f);
                        System.out.println(f + " grados Fahrenheit son equivalentes a " + c + " grados Celsius.");
                    } catch (Exception e) {
                        System.out.println("Error durante la conversión: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
            }

        }while(aux != 0);


    }
}
