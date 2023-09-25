package carpeta;

import java.util.Scanner;

public class CadenasString {

	public static void main(String[] args) {
		String nombre; //String es un tipo de dato que permite almacenar texto
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un nombre: ");
		nombre=entrada.nextLine();
		
		System.out.println("Hola "+nombre );
		
		//Metodos de los String
		System.out.println(nombre.toUpperCase()); //Convierte el String a Mayús
		System.out.println(nombre.toLowerCase()); //Convierte el String a Minus
		System.out.println(nombre.trim()); //Trim remueve espacios
		System.out.println(nombre.charAt(0)); //Retorna el caracter, indicando ´por la indice iniciando en 0 
		System.out.println(nombre.length()); //Retorna la longitud del String
		System.out.println(nombre.equals("Isaac")); //"=="
		
		for(int i=nombre.length()-1; i>=0; i--) {
			System.out.print(nombre.charAt(i));
		}
		
	}

}
