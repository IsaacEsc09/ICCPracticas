package ciclos;

import java.util.Scanner;

public class TablaMutilplicar {
//Ejercicio 11 de la serie de Ciclos
	public static void main(String[] args) {
		int num, i=1;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe un número: ");
		num=entrada.nextInt();
		
		while(i<=100) {
			System.out.println(num+"x"+i+"="+i*num);
			i=i+1;  //Incremento unitario
		}
		

		
	}

}
