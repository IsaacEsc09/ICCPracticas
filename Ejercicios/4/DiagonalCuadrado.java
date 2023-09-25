package carpeta;

import java.util.Scanner;

public class DiagonalCuadrado {

	public static void main (String args[]) {
		double diagonal;
		double lado;
		
		System.out.println("Ingrese la diagonal de su cuadrado");
		Scanner entrada = new Scanner(System.in);
		diagonal=entrada.nextDouble();
		
		lado= diagonal/Math.sqrt(2);
		
		System.out.println("El valor de sus lados es: "+lado);

		System.out.println("Su area es: "+(lado*lado)+" y su perimetro es: "+(lado+lado+lado+lado));

	}
}
