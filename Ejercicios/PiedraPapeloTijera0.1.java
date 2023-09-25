package piedrapapelotijera;


import java.util.Random;
import java.util.Scanner;

public class PiedraPapeloTijera {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Random random = new Random();
		String computadora;
		
		System.out.println("Bienvenido al juego de Piedra, papel o tijera.\n"
				+"Selecciona tu mano para jugar, elige: piedra, papel o tijera:");
		
		while(true) {
		
		String manoUsuario = entrada.nextLine().toLowerCase();
		
		int numRandom = random.nextInt(2)+1;
		
		if (numRandom == 1 ) {
			 computadora =  "piedra";
		}else {
			if (numRandom == 2 ) {
				 computadora =  "papel";
				}else {
					 computadora =  "tijera";
					}
				}
		
		if (manoUsuario.equals("piedra")||manoUsuario.equals("papel")||manoUsuario.equals("tijera")) {
			System.out.println("Tu escojiste: "+manoUsuario);
			System.out.println("La maquina escogio: "+computadora);
			
			if ((manoUsuario.equals("piedra")&&computadora.equals("tijera"))||
				(manoUsuario.equals("papel")&&computadora.equals("piedra"))||
				(manoUsuario.equals("tijera")&&computadora.equals("papel"))) {
				System.out.println("Ganaste!!!");
		}else { 
			if (manoUsuario==computadora) {
				System.out.println("Empate.");
		}else {
			System.out.println("Perdiste.");
				}
			}
			break;
		}else {
			System.out.println("La palabra ingresada no es valida, vuelve a intentarlo escribiendo tu jugada en letras minusculas");
			}
		}
		
	}
}