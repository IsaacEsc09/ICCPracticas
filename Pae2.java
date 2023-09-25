package ciclos;

import java.util.Scanner;

public class Pae2 {

	public static void main(String[] args) {

		int adeuda;
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Escribe el no. de materias que debes:");
		adeuda=entrada.nextInt();
		
		while(adeuda<0) {
			System.out.println("Error, escribe un número valido:");
			adeuda=entrada.nextInt();
			
		}
		
		if(adeuda>=1 && adeuda <= 7 ) {
			System.out.println("Puedes inscribir PAE");
		}else {
			System.out.println("No puedes inscribirte a PAE");
		}
	}

}
