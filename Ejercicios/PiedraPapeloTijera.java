package piedrapapelotijera;

import java.util.Random;
import java.util.Scanner;

	

public class PiedraPapeloTijera {

	public enum Juego {
		PIEDRA,
		PAPEL,
		TIJERA		}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Random random = new Random();
		
		Juego[] opciones = Juego.values();
		
		System.out.println("Bienvenido al juego de Piedra, papel o tijera.\n"
				+"Selecciona tu mano para jugar, elige: piedra, papel o tijera:");
		
		while(true) {
		
		String entradaUsuario = entrada.nextLine().toLowerCase();
	    Juego manoUsuario = null;
	    
	    for (Juego opcion : opciones) {
            if (opcion.toString().toLowerCase().equals(entradaUsuario)) {
                manoUsuario = opcion;
                break;
            }
	    }
	    
        if (manoUsuario == null) {
                System.out.println("La palabra ingresada no es válida, vuelve a intentarlo escribiendo tu jugada en letras minúsculas");
                continue;
            }
            
		Juego computadora = opciones[random.nextInt(opciones.length)];
		
		 System.out.println("Tu escogiste: " + manoUsuario);
         System.out.println("La máquina escogió: " + computadora);
		
		if ((manoUsuario == Juego.PIEDRA && computadora == Juego.TIJERA)
                || (manoUsuario == Juego.PAPEL && computadora == Juego.PIEDRA)
                || (manoUsuario == Juego.TIJERA && computadora == Juego.PAPEL)) 
		{
            System.out.println("¡¡Ganaste!!");
        } else {
        	if(manoUsuario == computadora) {
            System.out.println("Empate.");
        } else {
            System.out.println("Perdiste.");
        		}
	    
		}
	    }}
	
}