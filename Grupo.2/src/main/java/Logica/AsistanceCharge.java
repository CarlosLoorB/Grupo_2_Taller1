package Logica;

public class AsistanceCharge {



	public static Vacaciones sobrecargoAsistencia(Vacaciones vacacion)  {
		Integer asistentes = vacacion.getAsistentes();
		if (asistentes == 2) {
			vacacion.disminuirPrecio(200);
		}
		else if (4 < asistentes && asistentes < 10) {
			vacacion.precioDescuento(10);
		} else if (10 < asistentes) {
			vacacion.precioDescuento(200);
		}
		return vacacion;
	}

}
