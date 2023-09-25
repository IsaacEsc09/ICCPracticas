package trabajosalon;

public class Matematicas {

	public static void main (String args[]) {

	double resultado;
		
	//Calcula la potencia de un numero
	resultado = Math.pow(8,2);
	System.out.println("El resultado de 8 elevado a la 2 es "+resultado);
	
	//Calcula la raiz cuadrada de un numero
	resultado = Math.sqrt(25);
	System.out.println("El resultado de la raiz cuadrada de 25 es "+resultado);

	//Redondea un decimal
	resultado = Math.round(2.58);
	System.out.println(resultado);
	resultado = Math.round(2.49);
	System.out.println(resultado);
	
	resultado = Math.floor(2.999999);
	System.out.println(resultado);
	resultado = Math.ceil(2.000000001);
	System.out.println(resultado);
	
	
	//Nos muestra cual es el numero mayor o minimo
	resultado = Math.max(2.5,2.6);
	System.out.println(resultado);
	resultado = Math.min(1.2,1.3);
	System.out.println(resultado);
	
	resultado = Math.random();
	System.out.println(resultado);
	}
}
