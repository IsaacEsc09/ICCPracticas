package polimorfismo;

public class Poligono {
	private String nombre;
	private double base;
	private double altura;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return 0;
	}
	
	public Poligono() {
		
	}
	
	public String toString() {
		return "Soy un poligono: "+nombre+"\n"+
				"mi base es de: "+base+"\n"+
				"mi altura es de "+altura+"\n"+
				"mi área es de "+ calcularArea() ;
	}
	
	
	
	

}
