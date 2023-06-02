package interfaz;

import Excepciones.InvalidInputException;
import Logica.AsistantsValidator;
import Logica.DestinyValidator;
import Logica.DurationValidator;
import Logica.Vacaciones;

public final class Elecciones {

    private Elecciones() {  	
    }

    /**
     * @return
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
