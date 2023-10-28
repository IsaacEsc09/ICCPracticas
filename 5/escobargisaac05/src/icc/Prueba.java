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

    public static void cancion(int max) { //metodo que imprime la cancion con un four y tomando en cuenta el valor introducido del usuario.
        for (int i = 1; i <= max; i++) {

            Colors.print("On the ", Colors.RED+Colors.HIGH_INTENSITY);

            switch (i) {
                case 1: Colors.print("first", Colors.BLUE+Colors.HIGH_INTENSITY); break;
                case 2: Colors.print("second", Colors.YELLOW+Colors.HIGH_INTENSITY); break;
                case 3: Colors.print("third", Colors.GREEN+Colors.HIGH_INTENSITY); break;
                case 4: Colors.print("fourth", Colors.WHITE+Colors.HIGH_INTENSITY); break;
                case 5: Colors.print("fifth", Colors.BLUE+Colors.HIGH_INTENSITY); break;
                case 6: Colors.print("sixth", Colors.YELLOW+Colors.HIGH_INTENSITY); break;
                case 7: Colors.print("seventh", Colors.GREEN+Colors.HIGH_INTENSITY); break;
                case 8: Colors.print("eighth", Colors.WHITE+Colors.HIGH_INTENSITY); break;
                case 9: Colors.print("ninth", Colors.BLUE+Colors.HIGH_INTENSITY); break;
                case 10: Colors.print("tenth", Colors.YELLOW+Colors.HIGH_INTENSITY); break;
                case 11: Colors.print("eleventh", Colors.GREEN+Colors.HIGH_INTENSITY); break;
                case 12: Colors.print("twelfth", Colors.WHITE+Colors.HIGH_INTENSITY); break;
                 }

            Colors.print(" day of Christmas, my true love sent to me \n", Colors.RED+Colors.HIGH_INTENSITY);
            
            switch (i) {
                case 12: System.out.println("Twelve drummers drumming"); 
                case 11: System.out.println("Eleven pipers piping"); 
                case 10: System.out.println("Ten lords a-leaping"); 
                case 9: System.out.println("Nine ladies dancing"); 
                case 8: System.out.println("Eight maids a-milking"); 
                case 7: System.out.println("Seven swans a-swimming"); 
                case 6: System.out.println("Six geese a-laying"); 
                case 5: System.out.println("Five golden rings"); 
                case 4: System.out.println("Four calling birds"); 
                case 3: System.out.println("Three french hens"); ;
                case 2: System.out.println("Two turtle doves, and"); 
                case 1: System.out.println("A partridge in a pear tree\n"); break;
                default: System.out.println("Introduce un numero entre el 1 y el 12.");
            }
        }
    }

    public static void main(String args[]) {
        int aux;

        do {
            aux = getInt("Ingresa un entero entre 1 y 12.", "Por favor ingresa una opción válida.", 0, 12);
            if (aux != 0) {
                cancion(aux);
            }else {
                Colors.println("Vuelve pronto.", Colors.GREEN + Colors.HIGH_INTENSITY);
            }
        } while (aux != 0);
    }
}
