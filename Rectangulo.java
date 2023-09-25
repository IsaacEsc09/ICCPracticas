package polimorfismo;

public class Rectangulo extends Poligono {
	
	public Rectangulo(String nombre,double base, double altura) {
		
		setNombre(nombre);
		setBase(base);
		this.setAltura(altura);
	}
	
	
	//Sobreescribir el método calcularArea()
	public double calcularArea() {
		return this.getBase()*this.getAltura();
	}
	
	
}
