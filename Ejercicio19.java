package ciclos;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main (String args[]) {
		int computadora, jugador, vida=5;
		Scanner entrada = new Scanner(System.in);
		
		computadora=(int)(Math.random()*100+1);
		
		jugador=-1; //Forzamos el while a entrar
		
		while(computadora!=jugador&&vida>0) {
		System.out.println("Ingresa el número: ");
		jugador=entrada.nextInt();
		if(computadora==jugador) {
			System.out.println("Ganaste!!!");
		}else {
			System.out.println("Perdiste!!!");
			if(computadora>jugador) {
				System.out.println("Mi número es mayor");
				vida=vida-1;
				System.out.println("Tu número de vidas es "+vida);

			}else {
				System.out.println("Mi número es menor");
				vida=vida-1;
				System.out.println("Tu número de vidas es "+vida);

			}if(vida==0) {
			System.out.println("Te has quedado sin vidas, Perdiste!!!");
			System.out.println("Mi número era: "+computadora );
			}
		}
		
		}
		
		
		
		
		
	}
}
