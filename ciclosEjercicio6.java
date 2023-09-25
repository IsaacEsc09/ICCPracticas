package ciclos;
import java.util.Scanner;
public class ciclosEjercicio6 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("ingresa dos numeros: ");
		num1=entrada.nextInt();
		num2=entrada.nextInt();

		while(num1==num2) {
			System.out.println(num1);
			num1=num1+1;
		}
	}

}
