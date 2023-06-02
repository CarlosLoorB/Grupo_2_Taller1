package Logica;

public class DurationCharge {

	/**
	 * @param vacacion
	 * @return
	 */
    public static Vacaciones sobrecargoDuracion(Vacaciones vacacion)  {
        Integer duracion = vacacion.getDuracion();
        if(duracion < 7) {
            vacacion.aumentarPrecio(200);
        }else if (30 < duracion) {
            vacacion.disminuirPrecio(200);
        }
        return vacacion;
    }
	
}
