
package icc.figuras;

import java.util.Iterator;

import org.junit.Test;
import static org.junit.Assert.*;

import icc.Calificador;
import icc.RandomStringGenerator;

/**
 * Clase que agrega pruebas unitarias para el perimetro del Elipse.
 *
 * @author mindahrelfen
 */
public class ElipseZPerimeterTest extends Calificador {

    private static final double LIMIT_RANGE = 0.001;

    public static boolean almostEquals(double d1, double d2) {
        if (d2 > d1) {      // d1 = 5, d2 = 7
            d1 = d1 + d2;   // d1 = 12
            d2 = d1 - d2;   // d2 = 5
            d1 = d1 - d2;   // d1 = 7
        }

        return 0 <= (d1 - d2) && (d1 - d2) <= LIMIT_RANGE;
    }

    @Test
    public void elipsePerimeterTest() {
        Elipse e;
        double m, M, p;

        startTest("Revisa que perimetro del elipse encaje con el perimetro esperado.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);
        M /= 2.0;
        m /= 2.0;
        p = Math.PI * 3 * (M + m) - Math.PI * Math.sqrt((3 * M + m) * (M + 3 * m));
        assertTrue(almostEquals(e.perimetro(), p));
        addUp(1.0);

        passed();
    }
}
