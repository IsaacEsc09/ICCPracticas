package herencia;

public class Profesor extends Persona{

	String carrera;
	
	private double sueldo;
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double calcularImpuesto() {
		double impuesto;
		impuesto=(sueldo*.15);
		return impuesto;
	}
	
	

	
	public Profesor(String nombre, String correo, String carrera,double sueldo) {
		this.setNombre(nombre);
		this.setCorreo(correo);
		this.carrera=carrera;
		this.setSueldo(sueldo);
		
	}


	
	
}
