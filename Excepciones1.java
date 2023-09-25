package exception;

import java.util.Scanner;

public class Excepciones1 {

	public static void main(String[] args) {
		int a;
		int b;
		boolean datosCorrectos=false;
		
		while(datosCorrectos==false) {
			try {
				Scanner entrada= new Scanner (System.in);
				System.out.println("Ingresa número 1:");
				a=entrada.nextInt();
				
				System.out.println("Ingresa número 2:");
				b=entrada.nextInt();
				
				System.out.println("La suma es:"+(a+b));
				datosCorrectos=true;
			}catch(Exception e) {
				System.err.println("Los datos ingresados son incorrectos");
			}
		}
		System.out.println("El programa sigue");
	}

}
