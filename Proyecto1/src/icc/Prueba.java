package icc;

import java.util.Scanner;
import icc.colors.Colors;
import icc.clases.Modelo;
import icc.clases.Simulacion;

public class Prueba {

    public static int getInt(String mensaje, String error, int min, int max) {
        int val;
        Scanner scn = new Scanner(System.in);

        while (true) {
            Colors.println(mensaje,Colors.WHITE+Colors.HIGH_INTENSITY);
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
            Colors.println(mensaje,Colors.WHITE+Colors.HIGH_INTENSITY);
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
        int aux, opcion;
        String mensaje, error;
        Scanner scn = new Scanner(System.in);
        Modelo modelo = new Modelo();


        Colors.println("Bienvenido este programa es un simulador de un torneo Round-Robin de volleybol...\n",Colors.WHITE+Colors.HIGH_INTENSITY);
        opcion = getInt("Cuantos equipos tendra tu simulacion? (a partir de 2 equipos o mas)", "Opción no válida. Introduce un número mayor o igual a 2.", 2, 10);

        //Metodo para la creacion de equipos de acuerdo al numero ingresado por el usuario y tambien le pedira el nombre de cada equipo.
        modelo.equipos(opcion);

        do {
        
            Colors.println("1. Consultar puntuaciones.",Colors.WHITE+Colors.HIGH_INTENSITY);
            Colors.println("2. Continuar simulacion.",Colors.WHITE+Colors.HIGH_INTENSITY);
            Colors.println("0. Salir",Colors.WHITE+Colors.HIGH_INTENSITY);

            aux = scn.nextInt();

            switch (aux) {
                case 1: {
                modelo.consultar(opcion);
                    break;
                }
                case 2: {
                    
                    break;
                }
                case 0: {
                    Colors.print("Vuelve pronto :)"+"\n",Colors.CYAN+Colors.HIGH_INTENSITY);
                    break;
                }
                default: {
                    Colors.println("Opción no válida."+"\n",Colors.RED+Colors.HIGH_INTENSITY);
                    break;
                }
            }

        } while (aux != 0);
    }

}