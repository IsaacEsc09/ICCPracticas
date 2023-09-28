
package icc.figuras;

import java.text.DecimalFormat;

import icc.colors.Colors;

/**
 * Clase que simula el funcionamiento de un circulo.
 *
 * @author Mindahrelfen
 */
public class Circulo {

    /**
     * Double que denota el radio de un circulo.
     */
    private double radio;

    /**
     * Constructor que crea un circulo con el radio dado.
     *
     * @param radio Valor del radio.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo de acceso al radio de este circulo.
     *
     * @return double Radio de este circulo.
     */
    public double radio() {
        return this.radio;
    }

    /**
     * Metodo de acceso al diametro de este circulo.
     *
     * @return double Diametro de este circulo.
     */
    public double diametro() {
        return radio() * 2.0;
    }

    /**
     * Metodo que calcula el perimetro del circulo.
     *
     * @return double Perimetro de este circulo.
     */
    public double perimetro() {
        return Math.PI * diametro();
    }

    /**
     * Metodo que calcula el area del circulo.
     *
     * @return double Area de este circulo.
     */
    public double area() {
        return Math.PI * Math.pow(radio(), 2.0);
    }

    /**
     * Metodo que revisa si el circulo dado encaja exactamente con este circulo.
     *
     * @param c Circulo con quien hacer la comparacion.
     * @return boolean true Si el circulo dado encaja exactamente con este circulo.
     */
    public boolean encaja(Circulo c) {
        return almostEquals(c.radio(), this.radio());
    }

    /**
     * Metodo que revisa si dos valores flotantes son casi iguales.
     *
     * @param d1 Primer valor a revisar.
     * @param d2 Segundo valor a revisar.
     *
     * @return boolean - true si d1 y d2 son casi iguales.
     */
    public static boolean almostEquals(double d1, double d2) {
        if (d2 > d1) {      // d1 = 5, d2 = 7
            d1 = d1 + d2;   // d1 = 12
            d2 = d1 - d2;   // d2 = 5
            d1 = d1 - d2;   // d1 = 7
        }

        return 0 <= (d1 - d2) && (d1 - d2) <= 0.01;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat pattern = new DecimalFormat("0.0##");

        sb.append(Colors.HIGH_INTENSITY);
        sb.append("\tRadio: ");
        sb.append(Colors.RESTORE);
        sb.append(pattern.format(radio()) + "\n");
        sb.append(Colors.HIGH_INTENSITY);
        sb.append("\tDiametro: ");
        sb.append(Colors.RESTORE);
        sb.append(pattern.format(diametro()) + "\n");
        sb.append(Colors.HIGH_INTENSITY);
        sb.append("\tPerimetro: ");
        sb.append(Colors.RESTORE);
        sb.append(pattern.format(perimetro()) + "\n");
        sb.append(Colors.HIGH_INTENSITY);
        sb.append("\tArea: ");
        sb.append(Colors.RESTORE);
        sb.append(pattern.format(area()) + "\n");

        return sb.toString();
    }
}
