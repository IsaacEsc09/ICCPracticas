package exception;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		int num;
		int[]Calificaciones= {10,8,6,9,7,6,8,5,10,8};
		boolean datosCorrectos=false;
		
		
		
		while(datosCorrectos==false) {
		try {
			
		Scanner entrada=new Scanner(System.in);	
		System.out.println("Selecciona una calificación:");
		num=entrada.nextInt();
		
		System.out.println(Calificaciones[num]);
		datosCorrectos=true;
		}catch (Exception e) {
			System.err.println("El número ingresado no proporciona ninguna calificacion");
		}
		
		
		
		}
		
	}

}
