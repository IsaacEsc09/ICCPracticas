package herencia;

public class Persona {
	private String nombre;
	private String correo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String saludar() {
		return "Hola, mi nombre es "+nombre+"\n"+
				"Mi correo es "+correo;
	}
	
	
}
