package ciclos;
import java.util.Scanner;
public class Pae {

	public static void main(String[] args) {

		int adeuda;
		Scanner entrada= new Scanner (System.in);
		
		do {
			System.out.println("Escribe el no. de materias que debes:");
			adeuda=entrada.nextInt();
			
		}while(adeuda<0);
		
		if(adeuda>=1 && adeuda <= 7 ) {
			System.out.println("Puedes inscribir PAE");
		}else {
			System.out.println("No puedes inscribirte a PAE");
		}
		
	}

}
