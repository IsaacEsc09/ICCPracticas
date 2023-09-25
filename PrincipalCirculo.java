package poo;

public class PrincipalCirculo {

	public static void main(String[] args) {
		
		//Clase identificador = new Constructor();
		CirculoPoo cir1 = new CirculoPoo();
		cir1.radio=5;
		System.out.println("El circulo 1 : ");
		System.out.println("El area del circulo 1 es "+cir1.calcularArea());
		System.out.println("El perimetro del circulo 1 es "+cir1.calcularPerimetro());
		
		CirculoPoo cir2= new CirculoPoo();
		cir2.radio=10;
		System.out.println("El circulo 2: ");
		System.out.println("El area del circulo 2 es"+cir2.calcularArea());
		System.out.println("El perimetro del circulo 1 es "+cir2.calcularPerimetro());
		
		CirculoPoo cir3 = new CirculoPoo();
		cir3.radio=3.9;
		System.out.println("El circulo 3 : ");
		System.out.println("El area del circulo 3 es "+cir3.calcularArea());
		System.out.println("El perimetro del circulo 3 es "+cir3.calcularPerimetro());
		
		CirculoPoo cir4 = new CirculoPoo();
		cir4.radio=100;
		System.out.println("El circulo 4 : ");
		System.out.println("El area del circulo 4 es "+cir4.calcularArea());
		System.out.println("El perimetro del circulo 4 es "+cir4.calcularPerimetro());
	}

}