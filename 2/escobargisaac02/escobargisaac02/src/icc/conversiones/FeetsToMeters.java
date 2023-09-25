
package icc.conversiones;

public class FeetsToMeters {

    private int meters;
    private double centimeters;

    public void convert(int feet, double inch) {
        centimeters = (inch + (12 * feet)) * 2.54;
        meters = (int)(centimeters / 100);
        centimeters = centimeters % 100;
    }

    public int meters() {
        return meters;
    }

    public double centimeters() {
        return centimeters;
    }
}
