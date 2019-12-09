package ficherosBinarios_2;

import java.io.Serializable;
import java.util.Arrays;

public class EstadoPartida implements Serializable {
	
	private int posicion[][] = new int[3][3];
	/*
	 * Casilla en blanco = 0
	 * Casilla jugador 1 = 1
	 * Casilla jugador 2 = 2
	 */
	private int turno = 1;
	
	public EstadoPartida() {
		
	}

	public int[][] getPosicion() {
		return posicion;
	}

	public void setPosicion(int i, int j) {
		
		this.posicion[i][j] = turno;
		if(turno == 1) turno = 2;
		else turno = 1;
	}

	@Override
	public String toString() {
		String output = "";
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) { 
				output += posicion[i][j];
			}
			output += "\n";
		}
		return "Posición= \n\n" + output  + "\n\nTurno= " + turno;
	}
	
}
