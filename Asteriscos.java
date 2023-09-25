package carpeta;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingresa un número:");
		num=entrada.nextInt();
		
		for (int i=1; i<=num;i++) { //Controla las Filas
			for(int j=1; j<=num;j++) { //Cotrola las Columnas
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
