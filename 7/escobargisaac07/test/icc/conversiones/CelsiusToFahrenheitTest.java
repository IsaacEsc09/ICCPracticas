
package icc.conversiones;

import java.util.Iterator;

import org.junit.Test;
import static org.junit.Assert.*;

import icc.Calificador;
import icc.RandomStringGenerator;

/**
 * Clase que agrega pruebas unitarias de conversiones de unidades de temperatura.
 *
 * @author mindahrelfen
 */
public class CelsiusToFahrenheitTest extends Calificador {

    @Override
    protected void init() {
        rsg = new RandomStringGenerator(range, false);
    }

    public static boolean almostEquals(double d1, double d2) {
        if (d2 > d1) {      // d1 = 5, d2 = 7
            d1 = d1 + d2;   // d1 = 12
            d2 = d1 - d2;   // d2 = 5
            d1 = d1 - d2;   // d1 = 7
        }

        return 0 <= (d1 - d2) && (d1 - d2) <= 0.01;
    }

    @Test
    public void checkConversion() {
        CelsiusToFahrenheit cf;
        FahrenheitToCelsius fc;
        double celsius, fahrenheit;

        startTest("Revisa que la conversion entre grados celsius y grados fahrenheit sea correcta mutuamente.", 1.0);

        cf = new CelsiusToFahrenheit();
        fc = new FahrenheitToCelsius();

        celsius = rdm.nextDouble() * rdm.nextInt(1000) - 273.15;

        fahrenheit = cf.convert(celsius);

        assertTrue(almostEquals(celsius, fc.convert(fahrenheit)));
        addUp(1.0);

        passed();
    }
}
