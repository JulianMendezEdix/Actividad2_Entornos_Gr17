package JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase.Jugador;

public class JugadorTest {
	
	private Jugador j1;
	
	@BeforeEach
	void setUp() throws Exception {
		//Me interesa antes de cada test tener un objeto persona 
		//limpio (nuevo)
		j1 = new Jugador();
		//configuramos todo lo que queramos antes de cada @Test
	}

	@AfterEach
	void tearDown() throws Exception {
		j1 = null;
	}

	@Test
	public void testDorsalPositivo() {
		j1.setDorsal(10);
		
		int resultadoEsperado = 10;
		int resultadoObtenido = j1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testDorsalNegativo() {
		j1.setDorsal(40);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j1.getDorsal();
		
		assertNotEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void expulsadoAmarillasTrue() {
		j1.setNumeroTarjetasAmarillas(2);
		
		assertTrue(j1.estaExpulsado());
	}
	@Test
	public void expulsadoAmarillasFalse() {
		j1.setNumeroTarjetasAmarillas(0);
		
		assertFalse(j1.estaExpulsado());
	}
	
	@Test
	public void expulsadoRoja() {
		j1.setNumeroTarjetasRojas(1);
		
		assertTrue(j1.estaExpulsado());
	}
	@Test
	public void expulsadoRojaFalse() {
		j1.setNumeroTarjetasRojas(2);
		
		assertFalse(j1.estaExpulsado());
	}
	
	
	

}
