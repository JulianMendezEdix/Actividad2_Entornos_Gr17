package clase;
/**
 * Clase soldado con estaMuerto y numeroBalas
 * 
 * @author ilaza 
 *
 */

public class Soldado {
	
	//ATRIBUTOS
	/**
	 * Saber si el soldado esta vivo o muerto 
	 */
	private boolean estaMuerto;
	/**
	 * Numero de balas utilizadas
	 */
	private int numeroBalas;
	
	//GETTER Y SETTER
	//Estos metodos no hace falta crear Javadoc
	
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	//METODOS PROPIOS
	
	/**
	 * Metodo donde nos dice si puede disparar o no
	 * dependiendo del numero de balas
	 * 
	 * @return true si el numero de balas es mayor que 0
	 * o false si es cero
	 */
	public boolean puedeDisparar() {
		if(this.numeroBalas > 0) {
			return true;
		}
		return false;
	}
	/**
	 * Metodo si las balas van decreciendo
	 * el soldado esta muerto
	 * 
	 * @param sol soldado pasado por parametro
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
	
	

}

