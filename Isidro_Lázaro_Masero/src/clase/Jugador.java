package clase;

/**
 * Clase Jugador con dorsal, numero de tarjetas amarillas y numero de tarjetas rojas
 * 
 * @author ilaza
 *
 */

public class Jugador {
	
	//ATRIBUTOS
	/**
	 * Dorsal del jugador
	 */
	private int dorsal;
	/**
	 * Tarjetas amarillas del jugador
	 */
	private int numeroTarjetasAmarillas;
	/**
	 * Tarjetas rojas del jugador
	 */
	private int numeroTarjetasRojas;
	
	//GETTER Y SETTER
	//Estos metodos no hace falta crear Javadoc
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
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
	
	//METODOS PROPIOS
	/**
	 * Metodo que da un dorsal a un jugador 
	 * que esta comprendido entre el 1 y el 30
	 * si no da -1
	 * 
	 * @param dorsal dar de alta un nuevo dorsal
	 */
	public void ponerDorsal(int dorsal) {
		
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}
	/**
	 * Metodo que analiza las tarjetas recibidas por un jugador
	 * para saber si ha sido expulsado o no
	 * 
	 * @return true o false dependiendo de las tarjetas recibidas
	 * por parte del jugador
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if(numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		
		if(numeroTarjetasRojas == 1) {
			expulsado = true;
		}
		
		return expulsado;
	}

}

