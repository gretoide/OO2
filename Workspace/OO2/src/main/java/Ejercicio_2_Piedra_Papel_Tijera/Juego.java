package Ejercicio_2_Piedra_Papel_Tijera;

public class Juego {
	private Jugador jugadorUno;
	private Jugador jugadorDos;
	
	public String jugar(Jugador jugadorUno, Jugador jugadorDos) {
		
		Jugada jugadaUno = jugadorUno.getMiJugada();
		Jugada jugadaDos = jugadorDos.getMiJugada();
		
		String resultado = jugadaUno.jugarContra(jugadaDos);
		
		return "Resultado: " + resultado;
	}

	@SuppressWarnings("unused")
	private Jugador getJugadorDos() {
		return jugadorDos;
	}

	@SuppressWarnings("unused")
	private void setJugadorDos(Jugador jugadorDos) {
		this.jugadorDos = jugadorDos;
	}



	@SuppressWarnings("unused")
	private Jugador getJugadorUno() {
		return jugadorUno;
	}


	@SuppressWarnings("unused")
	private void setJugadorUno(Jugador jugadorUno) {
		this.jugadorUno = jugadorUno;
	}
	
}
