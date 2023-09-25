package poo;

public class Tabulacion {
	private double inicio;
	private double fin;
	private double incremento;
	
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getFin() {
		return fin;
	}
	public void setFin(double fin) {
		this.fin = fin;
	}
	public double getIncremento() {
		return incremento;
	}
	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}
	
	
	public Tabulacion(double inicio,double fin,double incremento) {
		this.inicio=inicio;
		this.fin=fin;
		this.incremento=incremento;
	}
	public void imprimirTabulacion() {
		System.out.println("f(x)= 3x+2");
		System.out.println("x \t | \t f(x)");
		for(double i=inicio;i<=fin;i=i+incremento) {
			System.out.println(i+" \t | \t "+ (3*i+2) );
			
		}
		
	} 
	
}
