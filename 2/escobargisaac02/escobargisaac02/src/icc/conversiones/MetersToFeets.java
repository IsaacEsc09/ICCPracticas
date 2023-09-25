
package icc.conversiones;

public class MetersToFeets {

    private int feets;
    private double inches;

    public void convert(int meters, double centimeters) {
        inches = (centimeters + (100 * meters)) / 2.54;
        feets = (int)(inches / 12);
        inches = inches % 12;
    }

    public int feets() {
        return feets;
    }

    public double inches() {
        return inches;
    }
}
