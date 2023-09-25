package carpeta;

import java.util.Scanner;

public class Ejercicio {

	public static void main (String args[]) {

		int materias;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Bienvenido a la Inscripcion del PAE");
		System.out.println("Ingresa la cantidad de materias a deber: ");
		materias=entrada.nextInt();
	
		if(materias>=1&&materias<=7) {
			System.out.println("Eres candidato para la inscripcion del PAE");
		}else {
			System.out.println("No eres candidato para la inscripcion del PAE, lo sentimos.");
		}
		
	}
}
