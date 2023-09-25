package practica3;

//Clases importadas
import java.util.Random;
import java.util.Scanner;

public class Practica3 {
	
	//enum
	enum Juego {
		PIEDRA,
		PAPEL,
		TIJERA
	}
	
	public static void main (String args []) {
		Scanner scn = new Scanner (System.in);
		Random random = new Random();
		
		Juego[] opciones = Juego.values();
		
		 System.out.println("Bienvenido al juego de Piedra, papel o tijera.\n"
		 					+ "Selecciona tu mano a jugar:");
		 
		 //Muestra las opciones posibles (jugadas).
		 for (Juego juego : Juego.values()) {
		        System.out.println(juego);
		    }
		
		 Juego usuarioJugada = null;
		 
		 while (true) {
		
		 //valor de entrada del usuario.	 
		 String usuario = scn.nextLine().toUpperCase();
		 
		 //valor aleatorio de la maquina.
		
		 
		 if (usuario.equals(Juego.PIEDRA.toString())||
		     usuario.equals(Juego.PAPEL.toString())||
		     usuario.equals(Juego.TIJERA.toString())){
			 
		     usuarioJugada = Juego.valueOf(usuario.toUpperCase());
		     
		        break;
		    } else {
		        System.out.println("La palabra que introdujiste no es válida, vuelve a intentarlo escribiéndola en minúsculas");
		    }
		}

		Juego computadora = opciones[random.nextInt(opciones.length)];
		
		System.out.println("Tu escogiste: " + usuarioJugada);
		System.out.println("La máquina escogió: " + computadora);
		
		if((usuarioJugada.equals(Juego.PIEDRA)&&computadora.equals(Juego.TIJERA))||
		   (usuarioJugada.equals(Juego.PAPEL)&&computadora.equals(Juego.PIEDRA))||
		   (usuarioJugada.equals(Juego.TIJERA)&&computadora.equals(Juego.PAPEL))){
			System.out.println("¡¡¡Ganaste!!!");
		}else if(usuarioJugada==computadora) {
			System.out.println("Empate.");
		}else {
			System.out.println("Perdiste.");
		}
		
	}
}
