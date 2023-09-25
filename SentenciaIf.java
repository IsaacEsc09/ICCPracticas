package carpeta;

import java.util.Scanner;

public class SentenciaIf {

	public static void main (String args[]) {
		
		double totalPagar;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cual es tu monto de tu compra?");
		totalPagar=entrada.nextDouble();
		
		System.out.println("Tu compra fue de:"+totalPagar+" pesos");
		
		if(totalPagar<1000) {
			totalPagar=totalPagar+150;
		}
			
		System.out.println("El total con envio es de:"+totalPagar+" pesos");
		
		
	}
}
