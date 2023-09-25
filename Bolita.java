package carperta;

import java.util.Scanner;

public class Bolita {
	
	public static void main (String args[]) {
		int bolita;
		int adivina;
		Scanner entrada = new Scanner(System.in);
		
		bolita=(int)(Math.random()*5+1);
		
		System.out.println("Adivina donde quedo la bolita (1, 2, 3, 4 o 5): ");
		
		adivina=entrada.nextInt();
		
		if(bolita==adivina) {
			System.out.println("Ganaste!!!");
		}else {
			System.out.println("Sigue intentando!!!");
		}
		
		adivina=entrada.nextInt();
		if(bolita==adivina) {
			System.out.println("Ganaste!!!");
		}else {
			System.out.println("Perdiste!!!");
		}
		
		System.out.println("La bolita esta en el vaso "+bolita);

	}

}
