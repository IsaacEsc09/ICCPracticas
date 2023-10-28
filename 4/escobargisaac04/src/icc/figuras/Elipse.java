
package icc.figuras;

import java.text.DecimalFormat;

public class Elipse{

	private double ejeMayor;
	private double ejeMenor;
	private double distancia;

	public Elipse(double ejeMayor, double ejeMenor){

		if(ejeMenor>ejeMayor){
			double x = ejeMenor;
			ejeMenor=ejeMayor;
			ejeMayor=x;
		}

		this.ejeMayor=ejeMayor/2.0;
		this.ejeMenor=ejeMenor/2.0;
	}

	public double ejeMayor(){
		return this.ejeMayor*2.0;
	}

	public double ejeMenor(){
		return this.ejeMenor*2.0;
	}

	public double perimetro(){
        return 3.141592653589793 * (3.0 * (this.ejeMayor + this.ejeMenor) - Math.sqrt((3.0 * this.ejeMayor + this.ejeMenor) * (this.ejeMayor + 3.0 * this.ejeMenor)));
    }
    
    public double area(){
        return 3.141592653589793 * this.ejeMayor * this.ejeMenor;
    }
    
    public boolean encaja(final Circulo c){
        return almostEquals(c.radio() * 2.0, this.ejeMenor());
    }
    
    public static boolean almostEquals(double d1, double d2) {
        if (d2 > d1) {
            d1 += d2;
            d2 = d1 - d2;
            d1 -= d2;
        }
        return 0.0 <= d1 - d2 && d1 - d2 <= 0.001;
    }

}

