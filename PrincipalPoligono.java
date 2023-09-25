package polimorfismo;

public class PrincipalPoligono {
	public static void main(String args[]) {
		
		Poligono p1=new Rectangulo("Rectangulo",5,10);
		System.out.println(p1.toString()+"\n");
		
		Poligono p2 = new TrianguloRectangulo("Triangulo rectangulo",5,10);
		System.out.println(p2.toString()+"\n");
		
		Poligono p3 = new Cuadrado("Cuadrado",10);
		System.out.println(p3.toString());
		
		
	}
}
