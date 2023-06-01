package Interface;

import Excepciones.InvalidInputException;
import Logica.AsistanceCharge;
import Logica.DestinationCharge;
import Logica.DurationCharge;
import Logica.Vacaciones;

public class Menu {
	
	public static void mostrarMenu() {
		try {
		Vacaciones planVacacion = Elecciones.obtenerOpciones();
		planVacacion = DestinationCharge.sobrecargoDestino(planVacacion);
		planVacacion = AsistanceCharge.sobrecargoAsistencia(planVacacion);
		planVacacion = DurationCharge.sobrecargoDuracion(planVacacion);
		System.out.println("El precios final del viaje es: " +planVacacion.getPrecio());
		}
		catch(InvalidInputException ii) {
			System.out.println("-1");
			System.out.println(ii.getMessage());
		}
		}

}
