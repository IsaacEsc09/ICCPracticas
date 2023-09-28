
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
public class ElipseATest extends Calificador {

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
    public void elipseMayorTest() {
        Elipse e;
        double m, M;

        startTest("Revisa que el eje mayor del elipse encaje con el que se envio como parametro sin importar el orden.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);
        assertTrue(almostEquals(e.ejeMayor(), M));
        addUp(0.5);

        e = new Elipse(m, M);
        assertTrue(almostEquals(e.ejeMayor(), M));
        addUp(0.5);

        passed();
    }

    @Test
    public void elipseMenorTest() {
        Elipse e;
        double m, M;

        startTest("Revisa que el eje menor del elipse encaje con el que se envio como parametro sin importar el orden.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);
        assertTrue(almostEquals(e.ejeMenor(), m));
        addUp(0.5);

        e = new Elipse(m, M);
        assertTrue(almostEquals(e.ejeMenor(), m));
        addUp(0.5);

        passed();
    }

    @Test
    public void elipseAreaTest() {
        Elipse e;
        double m, M, a;

        startTest("Revisa que area del elipse encaje con el area esperada.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);
        M /= 2.0;
        m /= 2.0;
        a = Math.PI * M * m;
        assertTrue(almostEquals(e.area(), a));
        addUp(1.0);

        passed();
    }
}
