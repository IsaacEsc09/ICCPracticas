package icc.actas;

public class ActaMatrimonio extends Acta{

	String conyuge;
    String ciudad;
	
	public ActaMatrimonio(String nombre, String fecha, String conyuge, String ciudad) {
        super(nombre, fecha);
        this.conyuge = conyuge;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return this.ciudad;
    }
    
    public String getConyuge() {
        return this.conyuge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n");
        sb.append("Conyuge: ");
        sb.append(this.conyuge);
        sb.append("\n");
        sb.append("Ciudad: ");
        sb.append(this.ciudad);
        return sb.toString();
    }

}