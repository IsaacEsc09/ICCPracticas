package ahorcado;

import java.util.Random;
import java.util.Scanner;

public class JuegoDelAhorcado {
	public static void main (String arg[]) {
		String palabraSecreta =getpalabraSecreta();
		char [] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
		boolean juegoFinalizado = false;
		Scanner scanner = new Scanner (System.in);
		int intentos=3;
		
		do {
			System.out.println("Te quedan "+intentos+" intentos");
			System.out.println(palabraGuiones);
			System.out.println("Introduce una letra:");
			char letra = scanner.next().charAt(0);
			boolean algunaLetraAcertada = false;
			for(int i=0; i<palabraSecreta.length(); i++) {
				if(palabraSecreta.charAt(i) == letra) {
					palabraGuiones[i]=letra;
					algunaLetraAcertada = true;
				}
			}
			if (!algunaLetraAcertada) {
				System.out.println("No has acertado ninguna letra.");
				--intentos;
				if(intentos==0) {
					System.out.println("Has perdido");
					juegoFinalizado=true;
				}
			}else {
					boolean juegoGanado = !hayGuiones(palabraGuiones);
					if(juegoGanado) {
					System.out.println("Has ganado el juego.");
					juegoFinalizado=true;
					}
					
				}
			
		}while(!juegoFinalizado);
		
	}
	
	static String getpalabraSecreta() { //metodo para palabraSecreta
	String [] palabras = {"casa", "coche", "acampar"}; //lista de palabras
	Random r = new Random(); //paquete random
	int n = r.nextInt(palabras.length);//longitud del arreglo del 0 al 2
	return palabras[n];//accede a alguna palabra del arreglo a traves de 'n'
	}
	
	static char[] getGuionesFromPalabra(String palabra) {
	int nLetrasPalabrasSecreta=palabra.length();
	char [] palabraGuiones = new char [nLetrasPalabrasSecreta];
	for(int i=0; i<palabraGuiones.length; i++) {
		palabraGuiones [i] = '_';}
	return palabraGuiones;}
	
	static boolean hayGuiones(char[] array) {
		for(char l:array) {
			if (l=='_')return true;
		}
		return false;
	}
	
}
