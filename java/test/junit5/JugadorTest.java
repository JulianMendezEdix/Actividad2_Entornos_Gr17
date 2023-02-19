package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javabean.Jugador;

/**
 * Clase 'JugadorTest' para realizar las pruebas unitarias 
 * con junit5 sobre la entidad 'Jugador'
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
class JugadorTest {
	
	/**
	 * 1er método que testea el método setDorsal de la
	 * clase entidad 'Jugador'.<br><br>
	 * Asignamos al 'jugador1' un dorsal fuera de rango por el límite superior
	 */
	@Test
	void testSetDorsal1() {
		Jugador jug1 = new Jugador();
		jug1.setDorsal(31);
		assertTrue(jug1.getDorsal()==-1);
	}
	
	/**
	 * 2do método que testea el método setDorsal de la
	 * clase entidad 'Jugador'.<br><br>
	 * Asignamos al 'jug1' un dorsal dentro del rango.
	 */
	@Test
	void testSetDorsal2() {
		Jugador jug1 = new Jugador();
		jug1.setDorsal(10);
		assertTrue(jug1.getDorsal()==10);
	}
	
	/**
	 * 3er método que testea el método setDorsal de la
	 * clase entidad 'Jugador'.<br><br>
	 * Asignamos al 'jugador1' un dorsal fuera de rango por el límite inferior
	 */
	@Test
	void testSetDorsal3() {
		Jugador jug1 = new Jugador();
		jug1.setDorsal(0);
		assertEquals(-1, jug1.getDorsal());
	}
	
	/**
	 * 4to método que testea el método setDorsal de la
	 * clase entidad 'Jugador'.<br><br>
	 * Asignamos al 'jug1' un dorsal negativo (fuera de rango por el límite inferior)
	 */
	@Test
	void testSetDorsal4() {
		Jugador jug1 = new Jugador();
		// Asignamos al 'jug1' un 
		jug1.setDorsal(-2);
		assertEquals(-1, jug1.getDorsal()); 
	}
		
	

	/**
	 * 1er método que testea el método estaExpulsado de la
	 * clase entidad 'Jugador'.<br><br>
	 * Creamos un jugador sin tarjetas que no debería estar expulsado.
	 */
	@Test
	void testEstaExpulsado1() {
		Jugador jug1 = new Jugador(10, 0, 0);
		assertFalse(jug1.estaExpulsado());
	}
	
	/**
	 * 2do método que testea el método estaExpulsado de la
	 * clase entidad 'Jugador'.<br><br>
	 * Creamos un jugador con una amarilla que no debería estar expulsado.
	 */
	@Test
	void testEstaExpulsado2() {
		Jugador jug1 = new Jugador(10, 1, 0);
		assertFalse(jug1.estaExpulsado());
	}
		
	/**
	 * 3er método que testea el método estaExpulsado de la
	 * clase entidad 'Jugador'.<br><br>
	 * Creamos un jugador con dos amarillas que debería estar expulsado.
	 */
	@Test
	void testEstaExpulsado3() {
		Jugador jug1 = new Jugador(11, 2, 0);
		assertTrue(jug1.estaExpulsado());
	}
		
	/**
	 * 4 método que testea el método estaExpulsado de la
	 * clase entidad 'Jugador'.<br><br>
	 * Creamos un jugador con una roja que debería estar expulsado.
	 */
	@Test
	void testEstaExpulsado4() {
		Jugador jug1 = new Jugador(11, 1, 1);
		assertTrue(jug1.estaExpulsado());
	}
	
	/**
	 * 5to método que testea el método estaExpulsado de la
	 * clase entidad 'Jugador'.<br><br>
	 * Creamos un jugador con una roja y dos amarillas que 
	 * debería estar expulsado.
	 */
	@Test
	void testEstaExpulsado5() {
		Jugador jug1 = new Jugador(13, 2, 1);
		assertTrue(jug1.estaExpulsado());
	}
	
}
