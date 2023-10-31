package icc.clases;

import icc.colors.Colors;
import java.text.DecimalFormat;
import java.util.Scanner;
import icc.clases.Simulacion;


public class Modelo{

	Simulacion sim = new Simulacion();
	public String name [];

	public void equipos(int max){
        Scanner scn = new Scanner(System.in);
        name = new String[max];
		for(int i = 0; i<max; i++){
			System.out.println("Ingresa el nombre de algun equipo: ");
			this.name[i]=scn.nextLine();
		}

	}        

	public void consultar(int max){

		for(int i = 0; i<max; i++){
			int id;
			Colors.println("ID: "+i,Colors.YELLOW+Colors.HIGH_INTENSITY);
			Colors.println("Nombre: "+this.name[i],Colors.BLUE+Colors.HIGH_INTENSITY);
			Colors.println("Anotaciones: "+this.sim.anotaciones,Colors.YELLOW+Colors.HIGH_INTENSITY);
			Colors.println("Total a favor: "+this.sim.aFavor,Colors.GREEN+Colors.HIGH_INTENSITY);
			Colors.println("Total en contra: "+this.sim.enContra,Colors.RED+Colors.HIGH_INTENSITY);
			Colors.println("Sets a favor: "+this.sim.setsFavor,Colors.GREEN+Colors.HIGH_INTENSITY);
			Colors.println("Sets en contra: "+this.sim.setsContra,Colors.RED+Colors.HIGH_INTENSITY);
			Colors.println("Juegos Ganados: "+this.sim.juegosG,Colors.GREEN+Colors.HIGH_INTENSITY);
			Colors.println("Juegos Perdidos: "+this.sim.juegosP+"\n",Colors.RED+Colors.HIGH_INTENSITY);
			
		}       
	}

}