package Logica;

public final class AsistantsCharge {
	
    private AsistantsCharge() {
    }

    private static final int DESCUENTOMENOR = 200;

    private static final int DESCUENTOMAYOR = 200;
    
    private static final int LIMITEINFERIOR = 200;
    
    private static final int LIMITESUPERIOR = 200;

    /**
     * @param vacacion
     * @return
     */
    public static Vacaciones extraAsistencia(final Vacaciones vacacion) {
        Vacaciones vacacionFinal = vacacion;
        Integer asistentes = vacacion.getAsistentes();
        if (asistentes == 2) {
            vacacionFinal.disminuirPrecio(DESCUENTOMAYOR);
        } else if (LIMITEINFERIOR < asistentes && asistentes < LIMITESUPERIOR) {
            vacacionFinal.precioDescuento(DESCUENTOMENOR);
        } else if (LIMITESUPERIOR < asistentes) {
            vacacionFinal.precioDescuento(DESCUENTOMAYOR);
        }
        return vacacionFinal;
    }

}
