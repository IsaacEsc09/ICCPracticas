
package icc.conversiones;

public class DegreesToDecimal {

    private double decimal;

    public void convert(int degrees, int minutes, double seconds) {
        // COMPLETA AQUI
        decimal = degrees + (minutes / 60.0) + (seconds / 3600.0);
    }

    public double decimal() {
        return decimal;
    }
}
