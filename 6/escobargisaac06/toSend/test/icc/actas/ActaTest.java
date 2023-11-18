
package icc.actas;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Iterator;
import java.util.List;

import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.*;

import icc.readerwriter.ReaderWriter;
import icc.Prueba;
import icc.Calificador;
import icc.RandomStringGenerator;

/**
 * Clase que agrega pruebas unitarias a las actas
 *
 * @author mindahrelfen
 */
public class ActaTest extends Calificador {


    /**
     * Metodo que obtiene las actas por clase:
     * caso 0: Obtiene todas las actas.
     * caso 1: Obtiene las actas de matrimonio.
     * caso 2: Obtiene las actas de vacunacion.
     * caso 3: Obtiene las actas de nacimiento.
     *
     */
    public static List<String> getActas(int caso) {
        try {
            List<String> list = ReaderWriter.readLines("actas.csv");

            String[] array;
            String s, aux;

            if (caso == 0) return list;

            Iterator<String> it = list.iterator();

            while (it.hasNext()) {
                aux = it.next();
                array = aux.split(",");

                if (array.length == 4) {
                    if (caso != 1) it.remove();
                } else {
                    if (array[2].contains("[")) {
                        if (caso != 2) it.remove();
                    } else {
                        if (caso != 3) it.remove();
                    }
                }
            }

            return list;

        } catch (IOException e) {
            return null;
        }
    }

    @Test
    public void nombreTest() {
        Acta actas[];
        List<String> l;
        String s;
        String[] array;

        startTest("Revisa que los nombres principales de las actas encajen con la base.", 3.0);

        l = getActas(0);
        actas = Prueba.getActas();

        assertTrue(l.size() == actas.length);

        for (int i = 0; i < actas.length; i++) {
            s = l.get(i);
            array = s.split(",");

            assertTrue(array[0].equals(actas[i].getNombre()));
        }

        addUp(3.0);
        passed();
    }

    @Test
    public void fechaTest() {
        Acta actas[];
        List<String> l;
        String s;
        String[] array;

        startTest("Revisa que las fechas de las actas encajen con la base.", 3.0);

        l = getActas(0);
        actas = Prueba.getActas();

        assertTrue(l.size() == actas.length);

        for (int i = 0; i < actas.length; i++) {
            s = l.get(i);
            array = s.split(",");

            assertTrue(array[1].equals(actas[i].getFecha()));
        }

        addUp(3.0);
        passed();
    }

    @Test
    public void conyugeTest() {
        ActaMatrimonio acta;
        List<String> l;
        String[] array;

        startTest("Revisa que el conyuge de las actas de matrimonio encajen con la base.", 1.0);

        l = getActas(1);

        for (String s: l) {
            array = s.split(",");

            acta = new ActaMatrimonio(array[0], array[1], array[2], array[3]);

            assertTrue(array[2].equals(acta.getConyuge()));
        }

        addUp(1.0);
        passed();
    }

    @Test
    public void ciudad1Test() {
        ActaMatrimonio acta;
        List<String> l;
        String[] array;

        startTest("Revisa que la ciudad de las actas de matrimonio encajen con la base.", 1.0);

        l = getActas(1);

        for (String s: l) {
            array = s.split(",");

            acta = new ActaMatrimonio(array[0], array[1], array[2], array[3]);

            assertTrue(array[3].equals(acta.getCiudad()));
        }

        addUp(1.0);
        passed();
    }

    @Test
    public void ciudad2Test() {
        ActaNacimiento acta;
        List<String> l;
        String[] array;

        startTest("Revisa que la ciudad de las actas de nacimiento encajen con la base.", 1.0);

        l = getActas(3);

        for (String s: l) {
            array = s.split(",");

            acta = new ActaNacimiento(array[0], array[1], array[2]);

            assertTrue(array[2].equals(acta.getCiudad()));
        }

        addUp(1.0);
        passed();
    }

    @Test
    public void vacunasTest() {
        ActaVacunacion acta;
        List<String> l;
        String[] array;
        String aux;

        startTest("Revisa que las vacunas de las actas de vacunacion encajen con la base.", 1.0);

        l = getActas(2);

        for (String s: l) {
            array = s.split(",");

            s = array[2];
            s = s.replace("[", "");
            s = s.replace("]", "");

            acta = new ActaVacunacion(array[0], array[1], s.split(" "));

            StringBuilder sb = new StringBuilder();

            for (String s2: acta.getVacunas()) {
                sb.append(s2);
                sb.append(" ");
            }

            assertTrue(s.equals(sb.substring(0, sb.length() - 1)));
        }

        addUp(1.0);
        passed();
    }
}
