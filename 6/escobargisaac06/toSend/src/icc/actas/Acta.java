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
        final StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ");
        sb.append(this.nombre);
        sb.append("\n");
        sb.append("Fecha: ");
        sb.append(this.fecha);
        return sb.toString();
    }
}