package Ejercicio_2_Piedra_Papel_Tijera;

public interface Jugada {
	
	
	abstract String jugarContra(Jugada otraJugada);
	abstract String resolverPiedra();
	abstract String resolverPapel();
	abstract String resolverTijera();
}
