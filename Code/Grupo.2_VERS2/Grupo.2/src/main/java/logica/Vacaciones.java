package logica;

public class Vacaciones {
    String Destino;
    Integer Asistentes;
    Integer Duracion;
    double Precio;

    /**
     * Vacaciones
     */
    public Vacaciones() {
        this.Precio = 1000;
    }

	/**
	 * @return Destino
	 */
    public String getDestino() {
        return Destino;
    }

    /**
     * @param destino
     */
    public void setDestino(String destino) {
        Destino = destino;
    }

    /**
     * @return Asistentes
     */
    public Integer getAsistentes() {
        return Asistentes;
    }

	/**
	 * @param asistentes
	 */
    public void setAsistentes(Integer asistentes) {
        Asistentes = asistentes;
    }

	/**
	 * @return
	 */
    public Integer getDuracion() {
        return Duracion;
    }

	/**
	 * @param duracion
	 */
    public void setDuracion(Integer duracion) {
        Duracion = duracion;
    }
	
	/**
	 * @param aumento
	 */
    public void aumentarPrecio(double aumento) {
        Precio = Precio + aumento;
    }

	/**
	 * @param disminucion
	 */
    public void disminuirPrecio(double disminucion) {
        Precio = Precio - disminucion;
    }
	
	/**
	 * @param porcentaje
	 */
    public void precioDescuento(double porcentaje) {
        double descuento = porcentaje/100;
        this.Precio = Precio - (Precio*descuento);
    }
	
    /**
     * @return Precio
     */
    public double getPrecio() {
        return Precio;
    }
    
    /**
     * @param precio
     */
    public void setPrecio(double precio) {
        Precio = precio;
    }
}
