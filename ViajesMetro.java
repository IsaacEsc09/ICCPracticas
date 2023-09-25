package carpeta;

import java.util.Scanner;
public class ViajesMetro {

	public static final int COSTO_METRO=5;
	public static void main(String args[]) {
	
		int saldo;
		int cantidadViajes;
		int saldoSobrante;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el saldo de tu tarjeta");
		
		saldo=entrada.nextInt();
		cantidadViajes=saldo/COSTO_METRO;
		saldoSobrante=saldo%COSTO_METRO;
		
		System.out.println("Tu saldo es de:"+saldo+" pesos");
		System.out.println("Puede realizar:"+cantidadViajes+" viajes");
		System.out.println("Tu sobrante es de:"+saldoSobrante+" pesos");


		
	}
}
