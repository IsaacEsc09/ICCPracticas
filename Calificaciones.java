package arreglos;

public class Calificaciones {

	public static void main(String[] args) {

		int[] calificacionesAlan=new int[5];
		int[] calificacionesBeto= {7,8,9,5,6,10,9,8,7,6,6};
		double a=0;
		double promedio;
		
		//Acceder identificador[índice]
		System.out.println(calificacionesBeto[0]);
		System.out.println(calificacionesBeto[4]);
		System.out.println("Tamaño del arreglo= "+calificacionesBeto.length);
		
		//length
		//modificar un elemento del arreglo
		calificacionesBeto[3]=7;
		System.out.println(calificacionesBeto[3]);
		//Alan tiene calificaciones de cero por default
		//System.out.println(calificacionesAlan[1]);
		
		for(int i=0;i<=calificacionesBeto.length-1;i++) {
			System.out.println("Tu calificacion "+(i+1)+":"+calificacionesBeto[i]);
			a=a+calificacionesBeto[i];
		}
		
		promedio=a/calificacionesBeto.length;
		System.out.println("El promedio de Beto es "+promedio);
	}

}
