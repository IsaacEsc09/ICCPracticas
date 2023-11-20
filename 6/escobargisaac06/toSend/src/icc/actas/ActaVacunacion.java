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
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString() + "\n");
    sb.append("Vacunas: ");

    if (this.vacunas.length == 0 || (this.vacunas.length == 1 && this.vacunas[0].isEmpty())) {
        sb.append("\nSin Vacunas.");
    } else {
        for (String vacuna : this.vacunas) {
            sb.append("\n").append(vacuna);
        }
    }

    return sb.toString();
	}
}