package carpeta;

import java.util.Scanner;
public class Ejercicio {

	//Constantes
	public static final int COSTO_TORTA=18;
	public static final int TOTAL_TORTA=14;
	public static final int COSTO_ATOLE=12;
	public static final int TOTAL_ATOLE=8;

	
	public static void main (String args[]) {
		
		int cantidad; 
		int ingreso;	
		int ganancia;
		
		//Solo se coloca una sola vez
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de tortas de tamal vendidas");
		
		cantidad=entrada.nextInt();
		ingreso=COSTO_TORTA*cantidad;
		ganancia=ingreso-(TOTAL_TORTA*cantidad);
		
        System.out.println("Vendiste "+cantidad+ " tortas de tamal en la escuela, por lo tanto...");
		System.out.println("Obtuviste de dinero "+ingreso+" pesos");
		System.out.println("Y generaste "+ganancia+" pesos de ganancia");

		
		System.out.println("Ingresa la cantidad de atoles vendidos");
		
		cantidad=entrada.nextInt();
		ingreso=COSTO_ATOLE*cantidad;
		ganancia=ingreso-(TOTAL_ATOLE*cantidad);

		System.out.println("Vendiste "+cantidad+ " atoles en la escuela, y...");
		System.out.println("obtuviste de dinero "+ingreso+" pesos");
		System.out.println("Y generaste "+ganancia+" pesos de ganancia");
	}
	
}
