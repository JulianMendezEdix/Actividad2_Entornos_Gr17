package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javabean.Soldado;

/**
 * Clase 'SoldadoTest' para realizar las pruebas unitarias 
 * con junit5 sobre la entidad 'Soldado'
 * 
 * @author JulianMendezEdix
 * @version 1.0
 * 
 */
class SoldadoTest {

	
	/**
	 * 1er método que testea el método 'puedeDisparar' de la
	 * clase entidad 'Soldado'.<br><br>
	 * 
	 *  Esperamos que un soldado vivo y con 3 balas pueda disparar.
	 * 
	 */
	@Test
	void testPuedeDisparar1() {
		
		// Creamos un soldado vivo y con 3 balas.
		Soldado sol1 = new Soldado(false, 3);
		assertTrue(sol1.puedeDisparar());
		// Test OK.
		
	}
	
	/**
	 * 2do método que testea el método 'puedeDisparar' de la
	 * clase entidad 'Soldado'.<br><br>
	 * 
	 *  Esperamos que un soldado vivo y con 0 balas no pueda disparar.
	 * 
	 */
	@Test
	void testPuedeDisparar2() {
		// Creamos un soldado vivo y con 0 balas.
		Soldado sol1 = new Soldado(false, 0);
		assertFalse(sol1.puedeDisparar());
		// Test OK.
	}
	
	/**
	 * 3er método que testea el método 'puedeDisparar' de la
	 * clase entidad 'Soldado'.<br><br>
	 * 
	 *  Esperamos que un soldado vivo y con -1 balas no pueda disparar.
	 * 
	 */
	@Test
	void testPuedeDisparar3() {
		// Creamos un soldado vivo y con -1  balas.
		Soldado sol1 = new Soldado(false, -1);
		assertFalse(sol1.puedeDisparar());
		// Test OK.
	}
	
	/**
	 * 4to método que testea el método 'puedeDisparar' de la
	 * clase entidad 'Soldado'.<br><br>
	 * 
	 *  Esperamos que un soldado muerto no pueda disparar.
	 * 
	 */
	@Test
	void testPuedeDisparar4() {
		
		// Creamos un soldado muerto y con 3 balas que no debería disparar.
		Soldado sol1 = new Soldado(true, 4);
		assertFalse(sol1.puedeDisparar());
		/* 
		 * El test no ha pasado. Habría que comentárselo al desarrollador para que evaluase
		 * una solución (en el caso de que "el que pagase" necesitara implementarla)
		 */


	}
	
	
	/**
	 * 1er método que testea el método 'disparar' de la
	 * clase entidad 'Soldado'. <br><br>
	 * 
	 * Soldado 1 con balas dispara a soldado 2.<br>
	 * Esperamos que el soldado 2 esté muerto y el soldado 1 tenga una bala menos.
	 * 
	 */
	@Test
	void testDisparar1 () {
		Soldado sol1 = new Soldado(false, 3);
		Soldado sol2 = new Soldado(false, 500);
		sol1.disparar(sol2);
		assertTrue(sol2.getEstaMuerto());
		assertEquals(2,sol1.getNumeroBalas());
		//Test OK.
	}
	
	/**
	 * 2do método que testea el método 'disparar' de la
	 * clase entidad 'Soldado'. <br><br>
	 * 
	 * Soldado 1 sin balas dispara a soldado 2.<br>
	 * Esperamos que el soldado 2 esté vivo y el soldado 1 siga con 0 balas.
	 * 
	 */
	@Test
	void testDisparar2 () {
		Soldado sol1 = new Soldado(false, 0);
		Soldado sol2 = new Soldado(false, 500);
		sol1.disparar(sol2);
		assertFalse(sol2.getEstaMuerto());
		assertEquals(0,sol1.getNumeroBalas());
		/* 
		 * El test no ha pasado. Habría que comentárselo al desarrollador para que evaluase
		 * una solución (en el caso de que "el que paga" necesitara implementarla)
		 */
	}
	
	/**
	 * 3er método que testea el método 'disparar' de la
	 * clase entidad 'Soldado'. <br><br>
	 * 
	 * Soldado 1 con balas dispara a soldado 2 muerto.<br>
	 * Esperamos que el soldado 2 siga muerto y el soldado 1 tenga una bala menos.
	 * 
	 */
	@Test
	void testDisparar3 () {
		Soldado sol1 = new Soldado(false, 3);
		Soldado sol2 = new Soldado(true, 500);
		sol1.disparar(sol2);
		assertTrue(sol2.getEstaMuerto());
		assertEquals(2,sol1.getNumeroBalas());
		//TEST OK
	}
	
	/**
	 * 4to método que testea el método 'disparar' de la
	 * clase entidad 'Soldado'. <br><br>
	 * 
	 * Suicidio.<br>
	 */
	@Test
	void testDisparar4 () {
		Soldado sol1 = new Soldado(false, 3);
		sol1.disparar(sol1);
		assertTrue(sol1.getEstaMuerto());
		assertEquals(2,sol1.getNumeroBalas());
		//TEST OK
	}
	
}
