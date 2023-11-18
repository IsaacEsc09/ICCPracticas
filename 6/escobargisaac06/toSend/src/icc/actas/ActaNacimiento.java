package icc.actas;

public class ActaNacimiento extends Acta{

	String ciudad;
    
    public ActaNacimiento(String nombre, String fecha, String ciudad) {
        super(nombre, fecha);
        this.ciudad = ciudad;
    }
    
    public String getCiudad() {
        return this.ciudad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n");
        sb.append("Ciudad: ");
        sb.append(this.ciudad);
        return sb.toString();
    }
	
}