package Logica;

public class DestinyCharge {

    
	/**
	 * @param vacacion
	 * @return
	 */
    public static Vacaciones sobrecargoDestino(Vacaciones vacacion)  {
        String destino = vacacion.getDestino().toLowerCase();
        if (destino.equals("paris")) {
            vacacion.aumentarPrecio(500);
        } else if (destino.equals("new york city")) {
            vacacion.aumentarPrecio(600);
        }
        return vacacion;
    }

}
