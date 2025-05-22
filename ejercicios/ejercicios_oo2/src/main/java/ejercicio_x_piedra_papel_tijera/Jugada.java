package ejercicio_x_piedra_papel_tijera;

public interface Jugada {
	
	
	abstract String jugarContra(Jugada otraJugada);
	abstract String resolverPiedra();
	abstract String resolverPapel();
	abstract String resolverTijera();
}
