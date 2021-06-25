package junit5.es.esdix.ed.recuperacion;

import static org.junit.jupiter.api.Assertions.*;

import es.edix.ed.recuperacion.Clase;

import org.junit.jupiter.api.Test;

/**
 * Esta clase consta de las pruebas unitarias realizadas a los m�todos del ejercicio de recuperaci�n que se encuentran en "es.edix.ed.recuperacion.Clase"
 * 
 * @author Roberto Bueno Garc�a
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
	 * Este m�todo testea el m�todo Saludar() en el caso de que se envie una cadena de texto.
	 * 
	 */
	@Test
	public void testSaludar(){
		test();
		assertEquals("Hola Roberto",clase.saludar("Roberto"));
	}

	
	/**
	 * Este m�todo testea el m�todo Saludar() en el caso de que se envie un n�mero dentro de la cadena de texto.
	 * 
	 */
	@Test
	public void testNumeroSaludar(){
		test();
		assertEquals("Lo que me mandas es un numero",clase.saludar("1"));
	}
	
	
	/**
	 * Este m�todo testea el m�todo Saludar() en el caso de que la cadena de texto se encuentre vac�a.
	 * 
	 */
	@Test
	public void testVacioSaludar(){
		test();
		assertEquals("Lo que me mandas est� vac�o",clase.saludar("        "));
	}
	
	
	/**
	 * Este m�todo testea el m�todo Matematicas() en el caso de que se realize una suma a los n�meros 8 y 4.
	 * 
	 */
	@Test
	public void testSumaMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "sumar")==(8 + 4));
	}
	
	
	/**
	 * Este m�todo testea el m�todo Matematicas() en el caso de que se realize una resta a los n�meros 8 y 4.
	 * 
	 */
	@Test
	public void testRestaMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "restar")==(8 - 4));
	}
	
	
	/**
	 * Este m�todo testea el m�todo Matematicas() en el caso de que se realize una multiplicaci�n a los n�meros 8 y 4.
	 * 
	 */
	@Test
	public void testMultiplicacionMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "multiplicar")==(8 * 4));
	}
	
	
	/**
	 * Este m�todo testea el m�todo Matematicas() en el caso de que se realize una divisi�n a los n�meros 8 y 4.
	 * 
	 */
	@Test
	public void testDivisionMatematicas(){
		test();
		assertTrue(clase.matematicas(8, 4, "dividir")==(8 / 4));
	}
		
}
