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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()+"\n");
        sb.append("Ciudad: "+this.ciudad);
        return sb.toString();
    }
	
}