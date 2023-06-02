package interfaz;

import Excepciones.InvalidInputException;
import Logica.AsistantsCharge;
import Logica.DestinyCharge;
import Logica.DurationCharge;
import Logica.Vacaciones;

public final class Menu {

    private Menu() {
    }

    /**
     * Función mostrarMenu
     */
    public static void mostrarMenu() {
        try {
            Vacaciones vacacion = Elecciones.obtenerOpcion();
			// CHECKSTYLE: OFF
            vacacion = DestinyCharge.sobrecargoDestino(vacacion);
            vacacion = AsistantsCharge.extraAsistencia(vacacion);
            vacacion = DurationCharge.sobrecargoDuracion(vacacion);
			// CHECKSTYLE: ON
            System.out.println("Total: " + vacacion.getPrecio());
        } catch (InvalidInputException ii) {
            System.out.println("-1");
            System.out.println(ii.getMessage());
        }
    }

}
