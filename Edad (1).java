package carpeta;

import java.util.Scanner;
public class Edad {

	public static void main (String args []) {
		int edad;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad: ");
		edad = entrada.nextInt();
		
		if(edad<=12) {
			System.out.println("Niño");
		}else {
			if(edad<=20) {
				System.out.println("Joven");
			}else {
				if(edad<=59) {
					System.out.println("Adulto");
				}else {
					System.out.println("Adulto mayor");
				}
			}
		}
	}
}
