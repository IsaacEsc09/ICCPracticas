package icc;

import java.util.Scanner;

import icc.colors.Colors;
import icc.figuras.Circulo;
import icc.figuras.Elipse;

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

    public static void main(String args[]) {
        int opcion;
        String mensaje, error;
        Elipse e = null; // Declaración de la variable e fuera del bucle

        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa realiza algunas operaciones con la elipse.");
        System.out.println("1. Obtener el perimetro de una elipse.");
        System.out.println("2. Obtener el area de una elipse.");
        System.out.println("3. Revisar si un circulo se encuentra en el borde de una elipse.");
        System.out.println("0. Salir.");
        System.out.println("Escoje una opcion.");
        opcion = getInt("Escoje una opcion.", "Opción no válida. Introduce un número entre 0 y 3.", 0, 3);

        do {
            switch (opcion) {
                case 1: {
                    double mayor = getDouble("Ingresa el eje mayor del elipse.", "Valor no válido. Introduce un número mayor que 0.", 0.0, Double.MAX_VALUE);
                    double menor = getDouble("Ingresa el eje menor del elipse.", "Valor no válido. Introduce un número mayor que 0.", 0.0, Double.MAX_VALUE);

                    e = new Elipse(mayor, menor);
                    System.out.println("El perímetro de la elipse es: " + e.perimetro());
                    break;
                }
                case 2: {
                    double mayor = getDouble("Ingresa el eje mayor del elipse.", "Valor no válido. Introduce un número mayor que 0.", 0.0, Double.MAX_VALUE);
                    double menor = getDouble("Ingresa el eje menor del elipse.", "Valor no válido. Introduce un número mayor que 0.", 0.0, Double.MAX_VALUE);

                    e = new Elipse(mayor, menor);
                    System.out.println("El área de la elipse es: " + e.area());
                    break;
                }
                case 3: {
                double mayor = getDouble("Ingresa el eje mayor del elipse.", "Valor no válido. Introduce un número mayor que 0.", 0.0, Double.MAX_VALUE);
                double menor = getDouble("Ingresa el eje menor del elipse.", "Valor no válido. Introduce un número mayor que 0.", 0.0, Double.MAX_VALUE);

                e = new Elipse(mayor, menor);

                double radioCirculo = getDouble("Ingresa el radio del círculo.", "Valor no válido. Introduce un número mayor que 0.", 0.0, Double.MAX_VALUE);
                Circulo circulo = new Circulo(radioCirculo);

                if (e.encaja(circulo)) {
                System.out.println("El círculo encaja con el de la elipse.");
                } else {
                System.out.println("El círculo no encaja con el de la elipse.");
                }
                break;
                }
                case 0: {
                    System.out.println("Vuelve pronto :)");
                    break;
                }
                default: {
                    System.out.println("Opción no válida. Introduce un número entre 0 y 3.");
                    break;
                }
            }

            if (opcion != 0) {
                opcion = getInt("Escoje una opcion.", "Opción no válida. Introduce un número entre 0 y 3.", 0, 3);
            }

        } while (opcion != 0);
    }
}
