package interfaz;

import excepciones.InvalidInputException;
import logica.AsistantsCharge;
import logica.DestinyCharge;
import logica.DurationCharge;
import logica.Vacaciones;

public final class Menu {

	private Menu() {
	}

	/**
	 *
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
