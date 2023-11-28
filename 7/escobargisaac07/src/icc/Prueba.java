package icc;

import java.util.Scanner;
import icc.colors.Colors;
import java.text.DecimalFormat;
import icc.conversiones.CelsiusToFahrenheit;
import icc.conversiones.FahrenheitToCelsius;

public class Prueba {

    public static int getInt(String mensaje, String error, int min, int max) {
        int val = 0;
        String s;
        Scanner scn = new Scanner(System.in);

        boolean continuar;

        do {
            try {
                Colors.println(mensaje, Colors.HIGH_INTENSITY);
                s = scn.next();
                val = Integer.parseInt(s);
                // (-infinito, min) || (max, infinito)
                if (val < min || max < val) {
                    throw new NumberFormatException();
                } else {
                    continuar = false;
                }
            } catch (NumberFormatException e) {
                continuar = true;
                scn.reset();
                Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);
            }
        } while (continuar);

        return val;
    }

    public static double getDouble(String mensaje, String error, double min, double max) {
        double val = 0;
        String s;
        Scanner scn = new Scanner(System.in);

        boolean continuar;

        do {
            try {
                Colors.println(mensaje, Colors.HIGH_INTENSITY);
                s = scn.next();
                val = Double.parseDouble(s);
                // (-infinito, min) || (max, infinito)
                if (val < min || max < val) {
                    throw new NumberFormatException();
                } else {
                    continuar = false;
                }
            } catch (NumberFormatException e) {
                continuar = true;
                scn.reset();
                Colors.println(error, Colors.RED + Colors.HIGH_INTENSITY);
            }
        } while (continuar);

        return val;
    }

    public static void main(String args[]) {
        int aux;
        DecimalFormat df = new DecimalFormat("#.00");
        CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
        FahrenheitToCelsius fc = new FahrenheitToCelsius();

        do {
            aux = getInt("Este programa realiza la conversión entre grados Celsius y grados Fahrenheit.\n1. Celsius a Fahrenheit.\n2. Fahrenheit a Celsius.\n0. Salir.\nEscoge una opción.",
                    "Ingresa una opción válida (0, 1, 2).", 0, 2);

            switch (aux) {
                case 1:
                    try {
                        double c = getDouble("Ingresa los grados en Celsius:", "Ingresa un valor válido.", -273.15, Double.MAX_VALUE);
                        double f = cf.convert(c);
                        Colors.print(c,Colors.BLUE+Colors.HIGH_INTENSITY); Colors.print(" grados Celsius son equivalentes a ",Colors.WHITE+Colors.HIGH_INTENSITY); 
                        Colors.print(df.format(f),Colors.RED+Colors.HIGH_INTENSITY); Colors.println(" grados Fahrenheit.",Colors.WHITE+Colors.HIGH_INTENSITY);
                        } catch (Exception e) {
                        Colors.println("Error durante la conversión: " + e.getMessage(),Colors.RED);
                    }
                    break;

                case 2:
                    try {
                        double f = getDouble("Ingresa los grados en Fahrenheit:", "Ingresa un valor válido.", -459.67, Double.MAX_VALUE);
                        double c = fc.convert(f);
                        Colors.print(f,Colors.BLUE+Colors.HIGH_INTENSITY); Colors.print(" grados Celsius son equivalentes a ",Colors.WHITE+Colors.HIGH_INTENSITY); 
                        Colors.print(df.format(c),Colors.RED+Colors.HIGH_INTENSITY); Colors.println(" grados Fahrenheit.",Colors.WHITE+Colors.HIGH_INTENSITY);
                    } catch (Exception e) {
                        System.out.println("Error durante la conversión: " + e.getMessage());
                    }
                    break;

                case 0:
                    Colors.println("Saliendo del programa. :)",Colors.BLUE+Colors.HIGH_INTENSITY);
                    break;
            }

        } while (aux != 0);
    }

    
}
