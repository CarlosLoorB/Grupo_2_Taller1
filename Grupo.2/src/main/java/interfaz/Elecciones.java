package interfaz;

import excepciones.InvalidInputException;
import logica.AsistantsValidator;
import logica.DestinyValidator;
import logica.DurationValidator;
import logica.Vacaciones;

public final class Elecciones {

	private Elecciones() {
	}

	/**
	 * @return temp
	 * @throws InvalidInputException
	 */
	public static Vacaciones obtenerOpcion() throws InvalidInputException {
		String destino = DestinyValidator.validarDestino();
		Integer asistentes = AsistantsValidator.validarAsistentes();
		Integer duracion = DurationValidator.validarDuracion();
		Vacaciones temp = new Vacaciones();
		temp.setAsistentes(asistentes);
		temp.setDestino(destino.trim());
		temp.setDuracion(duracion);
		return temp;
	}

}
