package icc.actas;

public abstract class Acta{

	String nombre;
	String fecha;

	public Acta(String nombre, String fecha){
		this.nombre=nombre;
		this.fecha=fecha;
	}
	
	public String getNombre() {
        return this.nombre;
    }
    
    public String getFecha() {
        return this.fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: "+this.nombre+"\n");
        sb.append("Fecha: "+this.fecha);
        return sb.toString();
    }
}