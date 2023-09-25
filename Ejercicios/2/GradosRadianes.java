package carpeta;

import java.util.Scanner;

public class GradosRadianes {

	public static void main(String args[]) {
	double grados;
		
		
	System.out.println("Ingresa el numero del grado que quieras convertir a radianes");
	
	Scanner entrada = new Scanner (System.in);
	
	grados = entrada.nextDouble();
	
	System.out.println("El grado "+grados+" Equivale a: "+(grados*(Math.PI/180)));

}	
}
