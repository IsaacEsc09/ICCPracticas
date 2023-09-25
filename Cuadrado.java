package polimorfismo;

public class Cuadrado extends Poligono {
	
	
	public Cuadrado (String nombre,double base) {
		setNombre(nombre);
		setBase(base);
	}
	
	public String toString() {
		return "Soy un poligono: "+this.getNombre()+"\n"+
				"mi lado es de: "+this.getBase()+"\n"+
				"mi área es de "+ calcularArea() ;
	}
	
	//Sobreescribimos el método calcularArea
	public double calcularArea() {
		return this.getBase()*this.getBase();
	}
}
