
package icc.figuras;

import java.util.Iterator;

import org.junit.Test;
import static org.junit.Assert.*;

import icc.Calificador;
import icc.RandomStringGenerator;

/**
 * Clase que agrega pruebas unitarias generales para el elipse.
 *
 * @author mindahrelfen
 */
public class ElipseBCircleTest extends Calificador {

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
    public void elipsePerfectTest() {
        Elipse e;
        Circulo c;
        double m, M;

        startTest("Revisa que el circulo encaje perfectamente en un elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        c = new Circulo(m / 2);
        assertTrue(e.encaja(c));
        addUp(0.5);

        c = new Circulo((m / 2) - (LIMIT_RANGE / 3.0));
        assertTrue(e.encaja(c));
        addUp(0.25);

        c = new Circulo((m / 2) + (LIMIT_RANGE / 3.0));
        assertTrue(e.encaja(c));
        addUp(0.25);

        passed();
    }

    @Test
    public void elipseLessTest() {
        Elipse e;
        Circulo c;
        double m, M, r;

        startTest("Revisa que circulos mas chicos que el elipse no encajen en el elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        r = 0.0;
        while (m - (2 * LIMIT_RANGE) > r) {
            c = new Circulo(r / 2);
            assertFalse(e.encaja(c));
            r += LIMIT_RANGE;
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipseMoreTest() {
        Elipse e;
        Circulo c;
        double m, M, r;

        startTest("Revisa que circulos mas grandes que el elipse no encajen en el elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        r = m + (2 * LIMIT_RANGE);
        while (M > r) {
            c = new Circulo(r / 2);
            assertFalse(e.encaja(c));
            r += LIMIT_RANGE;
        }
        addUp(1.0);

        passed();
    }
}
