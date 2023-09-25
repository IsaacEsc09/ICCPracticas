package carpeta;

import java.util.Scanner;

public class Edad {

	public static void main (String args[]) {
		
		//Edad
		int edad;
		Scanner entrada = new Scanner (System.in);

		System.out.println("¿Cual es tu edad?");
		edad=entrada.nextInt();
		
		System.out.println("Tu edad es "+edad+" años");
		
		if(edad>=18) {
				System.out.println("Eres mayor de edad");
		}

		//Año de nacimiento
		int fechaAnio;

		System.out.println("¿Cual es tu año de nacimiento?");
		fechaAnio=entrada.nextInt();
		
		System.out.println("Tu año de nacimiento fue el "+fechaAnio);
		
		if(fechaAnio<=2005) {
				System.out.println("Eres mayor de edad");
		}
	}
}
