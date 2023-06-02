package logica;

public class Vacaciones {
	String Destino;
	Integer Asistentes;
	Integer Duracion;
	double Precio;

	public Vacaciones() {
		this.Precio = 1000;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public Integer getAsistentes() {
		return Asistentes;
	}

	public void setAsistentes(Integer asistentes) {
		Asistentes = asistentes;
	}

	public Integer getDuracion() {
		return Duracion;
	}

	public void setDuracion(Integer duracion) {
		Duracion = duracion;
	}
	
	public void aumentarPrecio(double aumento) {
		Precio = Precio + aumento;
	}

	public void disminuirPrecio(double disminucion) {
		Precio = Precio - disminucion;
	}
	
	public void precioDescuento(double porcentaje) {
		double descuento = porcentaje/100;
		this.Precio = Precio - (Precio*descuento);
	}
	
	public double getPrecio() {
		return Precio;
	}
	
	
}
