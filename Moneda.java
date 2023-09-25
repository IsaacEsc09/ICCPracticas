package carpeta;

public class Moneda {

	public static void main (String args[]) {
		int moneda;
		int aguila = 1;
		int sol = 2;
		
		moneda=(int)(Math.random()*2+1);
		
		
		System.out.println("Tu moneda salio: "+moneda);
		
		if(moneda==1||moneda==2) {
			System.out.println("Salio sol");
		}else {
			System.out.println("Salio aguila");
		}
	}
}
