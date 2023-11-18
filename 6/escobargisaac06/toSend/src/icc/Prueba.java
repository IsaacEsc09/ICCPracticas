
package icc;

import icc.actas.Acta;
import icc.actas.ActaMatrimonio;
import icc.actas.ActaNacimiento;
import icc.actas.ActaVacunacion;

import icc.readerwriter.ReaderWriter;

import java.util.List;

import java.io.IOException;

public class Prueba {

    public static Acta[] getActas() {
        try {
            List<String> list = ReaderWriter.readLines("actas.csv");

            Acta actas[] = new Acta[list.size()];
            String[] array;
            String s;

            for (int i = 0; i < actas.length; i++) {
                s = list.get(i);
                array = s.split(",");

                if (array.length == 4) {
                    actas[i] = new ActaMatrimonio(array[0], array[1], array[2], array[3]);
                } else {
                    if (array[2].contains("[")) {
                        s = array[2];
                        s = s.replace("[", "");
                        s = s.replace("]", "");
                        actas[i] = new ActaVacunacion(array[0], array[1], s.split(" "));
                    } else {
                        actas[i] = new ActaNacimiento(array[0], array[1], array[2]);
                    }
                }
            }

            return actas;

        } catch (IOException e) {
            return null;
        }
    }

    public static void main(String args[]) {
        Acta[] actas = getActas();

        for (Acta a: actas) {
            System.out.println(a);
            System.out.println();
        }
    }
}
