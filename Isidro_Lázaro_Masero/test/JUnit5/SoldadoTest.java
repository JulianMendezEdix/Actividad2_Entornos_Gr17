package JUnit5;

import clase.Soldado;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class SoldadoTest {

	@Test
	public void testPuedeDispararTieneBalas() {;
	    Soldado sol = new Soldado();
	    sol.setNumeroBalas(10);
		assertTrue(sol.puedeDisparar());
		
	}
	@Test
	public void testPuedeDispararSinBalas() {
		Soldado sol = new Soldado();
	    sol.setNumeroBalas(-10);
		assertFalse(sol.puedeDisparar());
	}
	@Test
	public void testDisparar() {
		
		Soldado sol = new Soldado();
		sol.setNumeroBalas(10);
		sol.setNumeroBalas(0);
		sol.setNumeroBalas(-10);
		
		assertTrue(sol.isEstaMuerto());
		
	}
	
	

}
