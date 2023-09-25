package herencia;
//extends
public class Alumno extends Persona {
	
	private int[] calificaciones;
	
	public double calcularPromedio() {
		double promedio;
		double a=0;
		for(int i=0;i<=calificaciones.length-1;i++) {
			a=a+calificaciones[i];
		}
		promedio=a/calificaciones.length;
		return promedio;
	}
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre,String correo,int[] calificaciones) {
		this.setNombre(nombre);
		this.setCorreo(correo);
		this.calificaciones=calificaciones;
		
	}
	
}
