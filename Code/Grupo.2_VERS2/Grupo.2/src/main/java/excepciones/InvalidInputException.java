package excepciones;

/**
 * @author CAELOS JR 2018
 *
 */
public class InvalidInputException extends Exception {
	
	/**
	 * @param mensaje
	 */
    public InvalidInputException(final String mensaje) {
        super(mensaje);
    }
}