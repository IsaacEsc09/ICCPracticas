package carpeta;

import java.util.Scanner;

public class VolumenPrisma {
	
	public static void main (String args[]) {
		double radio;
		double altura;
		
		System.out.println("Ingresa el radio de tu prisma circular ");
		
		Scanner entrada = new Scanner (System.in);
		
		radio = entrada.nextDouble();
		
		System.out.println("Ahora ingresa su altura ");
		
		altura = entrada.nextDouble();
		
		System.out.println("El área de tu prisma circular es " + (2*(Math.PI)*radio*altura+2*(Math.PI)*Math.pow(radio, 2)) );
		

	} 

}
