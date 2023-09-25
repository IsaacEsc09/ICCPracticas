package herencia;

public class PrincipalHerencia {

	public static void main(String[] args) {
		int [] calificaciones = {8,9,10,5,4,6,7,8};
		Alumno juan = new Alumno ("Juan", "juan@juan.com", calificaciones);
		System.out.println(juan.saludar());
		System.out.println("El promedio de "+juan.getNombre()+
				" "+juan.calcularPromedio()+"\n");
		
		
		String ingeniero="Ingeniero";
		Profesor roberto = new Profesor ("Roberto", "rober1@roberto.com", ingeniero , 30000);
		System.out.println(roberto.saludar());
		System.out.println("La carrera de Roberto es "+roberto.carrera);
		System.out.println("El sueldo de Roberto es de "+roberto.getSueldo()+
				" y su impuesto es de "+roberto.calcularImpuesto()+" , por lo tanto su total a recibir es "
						+ (roberto.getSueldo()-roberto.calcularImpuesto()));
	}

}
