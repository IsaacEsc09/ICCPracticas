package carpeta;

import java.util.Scanner;

public class RadianesGrados {

	public static void main(String args[]) {
		double radian;
		
		System.out.println("Ingresa el numero de radianes que quieras convertir a grados");
		
		Scanner entrada = new Scanner(System.in);
		
		radian=entrada.nextDouble();
		
		System.out.println("El radian: "+radian+" equivale a: "+(radian*(180/Math.PI))+" grados");

	}
}
