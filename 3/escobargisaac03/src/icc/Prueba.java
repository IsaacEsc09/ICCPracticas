package icc;

import java.util.Random;
import java.util.Scanner;
import icc.colors.Colors;

public class Prueba {

    enum Juego{
        PIEDRA,
        PAPEL,
        TIJERA
    }

    public static void main(String args[]) {
        Scanner entrada = new Scanner (System.in);
        Random random = new Random();
        
        Colors.println("Bienvenido al juego de Piedra, papel o tijera.\n"
                        +"Selecciona tu mano a jugar: \n"
                        +"PIEDRA\n"+"PAPEL\n"+"TIJERA",Colors.CYAN+Colors.HIGH_INTENSITY);
        
        Juego usuarioJugada = null;

            while (true) {
                // Valor de entrada del usuario.
                String usuario = entrada.nextLine().toUpperCase();

                if (usuario.equals("PIEDRA") || usuario.equals("PAPEL") || usuario.equals("TIJERA")) {
                    usuarioJugada = Juego.valueOf(usuario);
                    break;
                } else {
                    Colors.println("La palabra que introdujiste no es válida, vuelve a intentarlo.",Colors.RED + Colors.HIGH_INTENSITY);
                }
            }

                //Valor aleatorio de la computadora
                int numeroAleatorio = random.nextInt(3) + 1;
                
                Juego computadora;

                if (numeroAleatorio == 1) {
                    computadora = Juego.PIEDRA;
                } else if (numeroAleatorio == 2) {
                    computadora = Juego.PAPEL;
                } else {
                    computadora = Juego.TIJERA;
                }

            Colors.println("Tu escogiste: " + usuarioJugada,Colors.HIGH_INTENSITY);
            Colors.println("La máquina escogió: " + computadora,Colors.MAGENTA + Colors.HIGH_INTENSITY);

            if ((usuarioJugada == Juego.PIEDRA && computadora == Juego.TIJERA)
               ||(usuarioJugada == Juego.PAPEL && computadora == Juego.PIEDRA)
               ||(usuarioJugada == Juego.TIJERA && computadora == Juego.PAPEL)) {
                Colors.println("¡¡¡Ganaste!!!",Colors.GREEN + Colors.HIGH_INTENSITY );
            } else if (usuarioJugada == computadora) {
                Colors.println("Empate.",Colors.YELLOW + Colors.HIGH_INTENSITY);
            } else {
                Colors.println("Perdiste.",Colors.RED + Colors.HIGH_INTENSITY);}
    }
}
