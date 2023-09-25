package introduccion;

public class Variables {

	public static final double PI=3.14159;
	
	public static void main(String args[]) {
	
		boolean binario;
		char letra;
		byte numeroPequeno;
		short numero;
		int numero1;
		long numero2;
		float flotante;
		double doble;
		String mensaje;
		
		System.out.println("Esto es una constante " + PI);

		binario = false;
		System.out.println("Esto es un tipo de variable boolean " + binario);
		
		letra = 'I';
		System.out.println("Esto es un tipo de variable char " + letra);
		
		numeroPequeno =-127;
		System.out.println("Esto es un tipo de variable byte " + numeroPequeno);
		
		numero = 181;
		System.out.println("Esto es un tipo de variable short " + numero);
		
		numero1 = 20050509;
		System.out.println("Esto es un tipo de variable int " + numero1);
		
		numero2 = 745682675;
		System.out.println("Esto es un tipo de variable long " + numero2);
		
		flotante = 10.9f;
		System.out.println("Esto es un tipo de variable float " + flotante);
		
		doble = 1.77;
		System.out.println("Esto es un tipo de variable double " + doble);
		
		mensaje = "Hola Mundo 2";
		System.out.println("Esto es un tipo de variable String " + mensaje);

	}	
}
