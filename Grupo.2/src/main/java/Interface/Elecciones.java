package Interface;

import Logica.Vacaciones;
import Excepciones.InvalidInputException;
import Logica.AsistantsValidator;
import Logica.DestinyValidator;
import Logica.DurationValidator;

public class Elecciones {
	
	
	
	public static Vacaciones obtenerOpciones() throws InvalidInputException{
		
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
