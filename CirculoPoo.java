package poo;

public class CirculoPoo {

	public double radio;
	
	public double calcularArea() {
		double area;
		area=Math.PI*radio*radio;
		return area; //Resultado del metodo
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro=Math.PI*2*radio;
		return perimetro;
	}
	//Contructor se debe llamar igual que la clase
}
