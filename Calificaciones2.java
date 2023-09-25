package arreglos;

public class Calificaciones2 {

public static void main(String[] args) {
		
		int[][] alumnos=new int[4][5];
		//Acceder a un elemento de un arreglo bidimensional 
		//[fila][Columna]
		//alumnos[2][2]=10;
		String[] nombres= {
				"Sinai",
				"Cesar",
				"Ismael",
				"Estefani"  };
		double a=0;
		double promedio;
		for(int i=0;i<4;i++) {//Filas
			System.out.println("Calificaciones del alumno "+nombres[i]);
			a=0;
			for(int j=0;j<5;j++) {//Columnas
				alumnos[i][j]=(int)(Math.random()*6+5);
				System.out.println(alumnos[i][j]);
				a=a+alumnos[i][j];
			}
			promedio=a/5.0;
			System.out.println("El promedio de "+nombres[i]+" es "+promedio);
		}
		
    }
}
