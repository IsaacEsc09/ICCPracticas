package carpeta;

public class Dados {

	public static void main (String args[]) {
		int dado1;
		int dado2;
		int sumaDados;
	
		dado1= (int) (Math.random()*6+1);
		dado2= (int) (Math.random()*6+1);

		System.out.println("dado 1 = "+dado1);
		System.out.println("dado 2 = "+dado2);
		sumaDados=dado1+dado2;
		
		System.out.println("La suma de tus datos es = "+sumaDados);
		
		if(sumaDados==2 || sumaDados==12) {
			System.out.println("Ganaste!!!");
		}else {
			System.out.println("Perdiste todo tu dinero!!!");
		}

	}
}
