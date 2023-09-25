
package icc;

import icc.colors.Colors;
import icc.conversiones.MetersToFeets;
import icc.conversiones.FeetsToMeters;

import java.util.Scanner;

/**
 * Clase que implementa una aplicacion que convierte de metros y centimetros a
 * pies y pulgadas y viceversa.
 */
public class Prueba {

    static String c1 = Colors.BLUE + Colors.HIGH_INTENSITY;
    static String c2 = Colors.RED + Colors.HIGH_INTENSITY;
    static String r = Colors.RESTORE;

    /**
     * Metodo que convierte metros y centimetros a pies y pulgadas usando la
     * terminal como flujo de datos.
     *
     * @param int - Solo es una bandera de salida.
     */
    public static int metersToFeet() {
        MetersToFeets mF = new MetersToFeets();
        Scanner scn = new Scanner(System.in);

        int metros;
        double centimetros;

        Colors.println("Ingresa el valor de metros en enteros:", Colors.HIGH_INTENSITY);
        metros = scn.nextInt();

        Colors.println("Ingresa el valor de centimetros (menor a 100):", Colors.HIGH_INTENSITY);
        centimetros = scn.nextDouble();

        mF.convert(metros, centimetros);

        System.out.print("La conversion de " + metros + " metros ");
        System.out.print("y " + centimetros + " centimetros a ");
        System.out.println("pies y pulgadas es de:");
        Colors.println("Pies: ", Colors.CYAN + Colors.HIGH_INTENSITY);
        Colors.println(mF.feets(), Colors.HIGH_INTENSITY);
        Colors.println("Pulgadas: ", Colors.CYAN + Colors.HIGH_INTENSITY);
        Colors.println(mF.inches(), Colors.HIGH_INTENSITY);

        return 0;
    }

    /**
     * Metodo que convierte pies y pulgadas a metros y centimetros usando la
     * terminal como flujo de datos.
     *
     * @param int - Solo es una bandera de salida.
     */
    public static int feetsToMeters() {
        FeetsToMeters fM = new FeetsToMeters();
        Scanner scn = new Scanner(System.in);

        int pies;
        double pulgadas;

        Colors.println("Ingresa el valor de pies en enteros:", Colors.HIGH_INTENSITY);
        pies = scn.nextInt();

        Colors.println("Ingresa el valor de pulgadas (menor a 12):", Colors.HIGH_INTENSITY);
        pulgadas = scn.nextDouble();

        fM.convert(pies, pulgadas);

        System.out.print("La conversion de " + pies + " pies ");
        System.out.print("y " + pulgadas + " pulgadas a ");
        System.out.println("metros y centimetros es de:");
        Colors.println("Metros: ", Colors.CYAN + Colors.HIGH_INTENSITY);
        Colors.println(fM.meters(), Colors.HIGH_INTENSITY);
        Colors.println("Centimetros: ", Colors.CYAN + Colors.HIGH_INTENSITY);
        Colors.println(fM.centimeters(), Colors.HIGH_INTENSITY);

        return 0;
    }

    public static void main(String args[]) {
        int opcion;
        Scanner scn = new Scanner(System.in);

        Colors.println("Escribe 1 si quieres convertir de " + c1 + "metros y centimetros" + r + " a " + c2 + "pies y pulgadas." + r, Colors.HIGH_INTENSITY);
        Colors.println("Escribe otra cosa si quieres convertir de " + c2 + "pies y pulgadas" + r + " a " + c1 + "metros y centimetros." + r, Colors.HIGH_INTENSITY);

        opcion = scn.nextInt();

        opcion = opcion == 1 ? metersToFeet() : feetsToMeters();
    }
}
