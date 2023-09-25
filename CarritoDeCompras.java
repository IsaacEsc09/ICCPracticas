package carpeta;

import java.util.Scanner;
public class CarritoDeCompras {

	public static void main (String args []) {
		int monto;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa tu monto a pagar: ");
		monto=entrada.nextInt();
		
		if(monto<1000) {
			System.out.println("Tu costo de envio sera de 150 pesos");
			System.out.println("Tu costo total es de: "+(monto+150)+" pesos" );
	}else {
		System.out.println("Tu costo de envio sera de 50 pesos");
		System.out.println("Tu costo total es de: "+(monto+50)+" pesos");

	}

		
	}
}
