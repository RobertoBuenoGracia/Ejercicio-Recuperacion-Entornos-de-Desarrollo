package es.edix.ed.recuperacion;

import org.junit.platform.commons.util.StringUtils;

/**
 * Esta clase es un ejercicio de entornos de desarrolo y su objetivo es que hagamos una documentaci�n de JavaDoc y sus respectivos test de JUnit.
 * 
 * @author Oliver Centeno.
 * @version 1.0.0
 * @since 22-06-2021
 *
 */
public class Clase {
	
	private static final String NFE = "Lo que me mandas es un numero";
	private static final String BLANK = "Lo que me mandas est� vac�o";

	/**
	 * Este m�todo recoge un nombre el cual devuelve con un saludo, previamente el m�todo ha comprobado que el nombre no sea en realidad un n�mero o este est� en blanco.
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
	 * Este m�todo recoge dos n�meros y una opci�n de c�lculos aritm�ticos, realizando el calculo aritm�tico elegido con los numeros obtenidos.
	 * 
	 * @param x representa el primer n�mero con el que se realizar�n los c�lculos aritm�ticos.
	 * 
	 * @param y representa el segundo n�mero con el que se realizar�n los c�lculos aritm�ticos.
	 * 
	 * @param op representa el tipo de c�lculo aritmetico al que ser�n sometidos los n�meros.
	 *           
	 * @return El valor numerico resultante del c�lculo aritm�tico realizado.
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

