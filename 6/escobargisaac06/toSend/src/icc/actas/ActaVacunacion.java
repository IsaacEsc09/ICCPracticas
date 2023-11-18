package icc.actas;

public class ActaVacunacion extends Acta{

	String[] vacunas;
    
    public ActaVacunacion(String nombre, String fecha, String [] vacunas) {
        super(nombre, fecha);
        this.vacunas = vacunas;
    }
    
    public String[] getVacunas() {
        return this.vacunas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n");
        sb.append("Vacunas: ");
        	if (this.vacunas.length == 1) {
            	if (this.vacunas[0].equals("")) {
                	sb.append("\n\t");
                	sb.append("Sin vacunar.");
            	}
            	else {
                	sb.append("\n");
                	sb.append(this.vacunas[0]);
            	}
        	}
        	else {
            	for (int i = 0; i < this.vacunas.length; ++i) {
                	sb.append("\n\t");
                	sb.append(this.vacunas[i]);
            	}
        	}
        	return sb.toString();
    }
	
}