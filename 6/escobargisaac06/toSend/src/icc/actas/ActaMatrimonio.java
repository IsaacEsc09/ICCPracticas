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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()+"\n");
        sb.append("Conyuge: "+this.conyuge+"\n");
        sb.append("Ciudad: "+this.ciudad);
        return sb.toString();
    }

}