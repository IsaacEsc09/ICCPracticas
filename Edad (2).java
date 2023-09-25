package carpeta;

import java.util.Scanner;

public class Edad {

	public static void main (String args[]) {
		
		//System.out.println(false&&true);
		
		//System.out.println(true||false);

		//System.out.println(!true);

		int edad;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Bienvenido a Medusa!!!");
		System.out.println("Ingresa tu edad: ");
		edad=entrada.nextInt();
		
		if(edad>=13&&edad<=55) {
			System.out.println("Puedes ingresar al juego!!!");

		}else {
			System.out.println("No puedes ingresar al juego, por tu seguridad");

		}

	}
}
