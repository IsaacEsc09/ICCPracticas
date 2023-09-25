package carpeta;

import java.util.Scanner;
public class Tamalero {

	public static final int tamal=16;
	
	public static void main (String args []) {
		int tamalesVen;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de Tamales vendidos: ");
		tamalesVen= entrada.nextInt();
		
		if(tamal*tamalesVen<=5000) {
			
			tamalesVen= tamalesVen*tamal;
			System.out.println("Obtuviste de ganancia: "+tamalesVen+" pesos");
			System.out.println("Obtuviste perdidas de: "+(tamalesVen-5000)+" pesos con respecto a tu inversion inicial de 5000 pesos");
		
		}else {
			tamalesVen= tamalesVen*tamal;
			System.out.println("Obtuviste de ganancia: "+tamalesVen+" pesos");
			System.out.println("Obtuviste ganancias de: "+(tamalesVen-5000)+" pesos con respecto a tu inversion inicial de 5000 pesos");
		}
		
	}
}
