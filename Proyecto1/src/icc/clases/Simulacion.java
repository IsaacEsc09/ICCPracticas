package icc.clases;

import icc.colors.Colors;
import java.text.DecimalFormat;
import icc.clases.Modelo;

public class Simulacion{

	public int[] anotaciones;
    public int[] aFavor;
    public int[] enContra;
    public int[] setsFavor;
    public int[] setsContra;
    public int[] juegosG;
    public int[] juegosP;

    public void estadisticasBase(int max) {//Metodo para empezar a inicializar los arreglos para cada equipo de acuerdo al numero que ingerso el usuario.
        anotaciones = new int[max];
        aFavor = new int[max];
        enContra = new int[max];
        setsFavor = new int[max];
        setsContra = new int[max];
        juegosG = new int[max];
        juegosP = new int[max];

        for (int i = 0; i < max; i++) {//Inicializa todos los arreglos de acuerdo al numero elegido por el usuario y empiezan teniendo 0 todos sus valores.
            anotaciones[i] = 0;
            aFavor[i] = 0;
            enContra[i] = 0;
            setsFavor[i] = 0;
            setsContra[i] = 0;
            juegosG[i] = 0;
            juegosP[i] = 0;
        }
    }



} 
