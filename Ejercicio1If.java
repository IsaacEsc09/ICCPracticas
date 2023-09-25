package carperta;
import java.util.Scanner;
public class Ejercicio1If {

	public static void main(String args[]) {
		int num1;
		int num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa 2 numeros");
		num1=entrada.nextInt();
		num2=entrada.nextInt();
		
		if (num1>num2) {
			System.out.println("El numero "+num1+" es mayor que 5"+ num2);
		}else {
			System.out.println("El numero "+num2+" es mayor que "+ num1);
		}
	}
}
