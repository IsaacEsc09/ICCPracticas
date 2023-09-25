package trabajosalon;

import java.util.Scanner;
public class Circulo {

	public static void main (String args[]) {

		int radio;
		double area;
		double perimetro;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el radio de un circulo");

		radio=entrada.nextInt();
		area=Math.PI*Math.pow(radio,2);
		perimetro=2*Math.PI*radio;

		System.out.println("El area de tu circulo es de "+area);
		System.out.println("El perimetro de tu circulo es de " + perimetro);

	}
}
