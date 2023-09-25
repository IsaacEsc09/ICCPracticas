package carpeta;

public class Moneda {

	public static void main(String[] args) {
		int moneda1, moneda2, moneda3, moneda4, moneda5;
		int suma;
		//aguila=1, sol =2
		
		moneda1=(int)(Math.random()*2);
		moneda2=(int)(Math.random()*2);
		moneda3=(int)(Math.random()*2);
		moneda4=(int)(Math.random()*2);
		moneda5=(int)(Math.random()*2);
		
		if(moneda1==1) {
			System.out.println("Moneda 1 Aguila");
		}else {
			System.out.println("Moneda 1 Sol");
		}
		
		if(moneda2==1) {
			System.out.println("Moneda 2 Aguila");
		}else {
			System.out.println("Moneda 2 Sol");
		}
		
		if(moneda3==1) {
			System.out.println("Moneda 3 Aguila");
		}else {
			System.out.println("Moneda 3 Sol");
		}
		
		if(moneda4==1) {
			System.out.println("Moneda 4 Aguila");
		}else {
			System.out.println("Moneda 4 Sol");
		}
		
		if(moneda5==1) {
			System.out.println("Moneda 5 Aguila");
		}else {
			System.out.println("Moneda 5 Sol");
		}
		
		suma=(moneda1+moneda2+moneda3+moneda4+moneda5);
		
		if(suma>=3) {
			System.out.println("¡¡Gana Aguila!!");
		}else {
			System.out.println("¡¡Gana Sol!!");
		}
		
	}

}
