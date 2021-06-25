package es.edix.ed.recuperacion;

import org.junit.platform.commons.util.StringUtils;

/**
 * Esta clase es un ejercicio de entornos de desarrolo y su objetivo es que hagamos una documentación de JavaDoc y sus respectivos test de JUnit.
 * 
 * @author Oliver Centeno.
 * @version 1.0.0
 * @since 22-06-2021
 *
 */
public class Clase {
	
	private static final String NFE = "Lo que me mandas es un numero";
	private static final String BLANK = "Lo que me mandas está vacío";

	/**
	 * Este método recoge un nombre el cual devuelve con un saludo, previamente el método ha comprobado que el nombre no sea en realidad un número o este esté en blanco.
	 * 
	 * @param nombre representa un nombre que hemos escogido para que el programa nos de un saludo con el mismo.
	 *           
	 * @return El saludo con el nombre correspondiente o un aviso si hemos dado un numero o un nombre en blanco.
	 */
	public String saludar(String nombre){
		try {
			Integer.parseInt(nombre);
			return NFE;
		}catch (NumberFormatException e) {
		}
		if(StringUtils.isBlank(nombre)) {
			return BLANK;
		}
		return "Hola " + nombre;
	}
	
	/**
	 * Este método recoge dos números y una opción de cálculos aritméticos, realizando el calculo aritmético elegido con los numeros obtenidos.
	 * 
	 * @param x representa el primer número con el que se realizarán los cálculos aritméticos.
	 * 
	 * @param y representa el segundo número con el que se realizarán los cálculos aritméticos.
	 * 
	 * @param op representa el tipo de cálculo aritmetico al que serán sometidos los números.
	 *           
	 * @return El valor numerico resultante del cálculo aritmético realizado.
	 */
	public double matematicas(int x, int y, String op){
		switch (op) {
			case "sumar":
				return x+y;
			case "restar":
				return x-y;
			case "multiplicar":
				return x*y;
			case "dividir":
				return x/y;
			default:
				return Double.valueOf(String.format("%1d.%2d", x, y));
				
		
		}
	}
}

