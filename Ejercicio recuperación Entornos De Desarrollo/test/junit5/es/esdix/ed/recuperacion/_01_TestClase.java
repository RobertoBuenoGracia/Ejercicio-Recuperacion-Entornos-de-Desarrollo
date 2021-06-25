package junit5.es.esdix.ed.recuperacion;

import static org.junit.jupiter.api.Assertions.*;

import es.edix.ed.recuperacion.Clase;

import org.junit.jupiter.api.Test;

/**
 * Esta clase consta de las pruebas unitarias realizadas a los métodos del ejercicio de recuperación que se encuentran en "es.edix.ed.recuperacion.Clase"
 * 
 * @author Roberto Bueno García
 * @version 1.0.0
 * @since 25-06-2021
 *
 */

public class _01_TestClase {
	
	private Clase clase;

	public void test() {
		clase = new Clase();
	}
	
	
	/**
	 * Este método testea el método Saludar() en el caso de que se envie una cadena de texto.
	 * 
	 */
	@Test
	public void testSaludar(){
		test();
		assertEquals("Hola Roberto",clase.saludar("Roberto"));
	}

	
	/**
	 * Este método testea el método Saludar() en el caso de que se envie un número dentro de la cadena de texto.
	 * 
	 */
	@Test
	public void testNumeroSaludar(){
		test();
		assertEquals("Lo que me mandas es un numero",clase.saludar("1"));
	}
	
	
	/**
	 * Este método testea el método Saludar() en el caso de que la cadena de texto se encuentre vacía.
	 * 
	 */
	@Test
	public void testVacioSaludar(){
		test();
		assertEquals("Lo que me mandas está vacío",clase.saludar("        "));
	}
	
	
	/**
	 * Este método testea el método Matematicas() en el caso de que se realize una suma a los números 8 y 4.
	 * 
	 */
	@Test
	public void testSumaMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "sumar")==(8 + 4));
	}
	
	
	/**
	 * Este método testea el método Matematicas() en el caso de que se realize una resta a los números 8 y 4.
	 * 
	 */
	@Test
	public void testRestaMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "restar")==(8 - 4));
	}
	
	
	/**
	 * Este método testea el método Matematicas() en el caso de que se realize una multiplicación a los números 8 y 4.
	 * 
	 */
	@Test
	public void testMultiplicacionMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "multiplicar")==(8 * 4));
	}
	
	
	/**
	 * Este método testea el método Matematicas() en el caso de que se realize una división a los números 8 y 4.
	 * 
	 */
	@Test
	public void testDivisionMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "dividir")==(8 / 4));
	}
		
}
