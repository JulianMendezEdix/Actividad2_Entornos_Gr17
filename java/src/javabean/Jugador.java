package javabean;

import java.util.Objects;

/**
 * Entidad 'Jugador' con un dorsal,
 * un número de tarjetas amarillas y un número de
 * tarjetas recibidas.
 * 
 * @author FelixDePablo & JulianMendezEdix
 * @version 1.1
 *
 */

public class Jugador {

	// ATRIBUTOS
	
	/**
	 * Dorsal o número del jugador.
	 */
	private int dorsal;
	/**
	 * Número de tarjetas amarillas que ha recibido 
	 * un jugador.
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Número de tarjetas rojas que ha recibido 
	 * un jugador.
	 */
	private int numeroTarjetasRojas;
	
	//MÉTODOS CONSTRUCTORES
	
	/**
	 * Método constructor vacío de la entidad 'Jugador'
	 */
	public Jugador() {
		super();
	}
	/**
	 * Método constructor de la clase entidad 'Jugador'
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	// GETTERS AND SETTERS
	
	public int getDorsal() {
		return dorsal;
	}
	
	/**
	 * Método que asigna el dorsal pasado como parámetro a
	 * un jugador. <br><br>
	 * El parámetro  tiene que ser estrictamente mayor que 0 <br>
	 * y menor que 31 para ser asignado, en cualquier<br>
	 * otro caso el método asignará -1 al dorsal.<br>
	 * 
	 * @since 1.1
	 * @param dorsal : un número entero correspondiente al dorsal del jugador.
	 */
	public void setDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	//Métodos toString() , hashCode() y equals() redefinidos.
	
	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dorsal, numeroTarjetasAmarillas, numeroTarjetasRojas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return dorsal == other.dorsal && numeroTarjetasAmarillas == other.numeroTarjetasAmarillas
				&& numeroTarjetasRojas == other.numeroTarjetasRojas;
	}

	// MÉTODOS
	
	/**
	 * Método que asigna el dorsal pasado como parámetro a <br>
	 * un jugador. El parámetro tiene que ser estrictamente <br>
	 * mayor que 0 y menor que 31 para ser asignado, en cualquier<br>
	 * otro caso el método asignará el dorsal -1.<br>
	 * 
	 * @param dorsal
	 * @since 1.0
	 * @deprecated Hemos llegado a la conclusión  que este método <br>
	 * es un "setDorsal" mejorado, por lo que hemos incluido su <br>
	 * funcionalidad en el setDorsal estándar. Metodo reemplazado por<br>
     *          {@link #setDorsal(int)}
	 */
	public void ponerDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
	
	/**
	 * Método que nos informa si un jugador está expulsado o no.<br>
	 * Un jugador está expulsado si tiene dos tarjetas amarillas. <br>
	 * También está expulsado si tiene una tarjeta roja.<br>
	 * 
	 * @return Devuelve TRUE si el jugador está expulsado, <br>
	 * o devuelve FALSE si el jugador sigue jugando.
	 * 
	 */
	public boolean estaExpulsado() {

		boolean expulsado = false;
		
		if (numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		if (numeroTarjetasRojas == 1) {
			expulsado = true;
		}
		return expulsado;
		
	}


	
}
