package ejercicio_x_piedra_papel_tijera;

public class Jugador {
	private String nombre;
	private Jugada miJugada;
	
	public Jugador(String nombre) {
		this.setNombre(nombre);
	}

	public Jugada getMiJugada() {
		return miJugada;
	}

	public void setMiJugada(Jugada miJugada) {
		this.miJugada = miJugada;
	}

	@SuppressWarnings("unused")
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
