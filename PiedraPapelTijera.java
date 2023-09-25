package carperta;
import java.util.Scanner;
public class PiedraPapelTijera {

	public static void main (String args[]) {
		int computadora;
		int yo;
		Scanner entrada = new Scanner (System.in);
		
		computadora=(int)(Math.random()*3+1);
		
		System.out.println("Escoge Piedra(1), Papel(2) o Tijera(3): ");
		yo=entrada.nextInt();
		
		System.out.println("La computadora escogio: "+computadora);
		
		if(computadora==1&&yo==2) {
			System.out.println("Ganaste!!!");
		}else {
			
			if(computadora==2&&yo==3) {
			System.out.println("Ganaste!!!");
		}else {
			
			
			if(computadora==3&&yo==1) {
			System.out.println("Ganaste!!!");
		}else {
			if (computadora==yo) {
			System.out.println("Empate");
		}else {
			System.out.println("Perdiste!!!");

		}
		}
		}
		}
			
	}
}
