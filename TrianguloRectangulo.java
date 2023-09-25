package polimorfismo;

public class TrianguloRectangulo extends Poligono {
	
	
	public TrianguloRectangulo(String nombre,double base,double altura) {
		setNombre(nombre);
		setBase(base);
		this.setAltura(altura);
	}
	
	//Sobreescribimos el método calcularArea
	public double calcularArea() {
		return this.getBase()*this.getAltura()/2;
	}
	
}
