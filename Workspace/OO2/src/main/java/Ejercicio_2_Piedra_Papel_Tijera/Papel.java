package Ejercicio_2_Piedra_Papel_Tijera;

public class Papel implements Jugada {

	@Override
	public String resolverPiedra() {
		// TODO Auto-generated method stub
		return "Papel";
	}

	@Override
	public String resolverPapel() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String resolverTijera() {
		// TODO Auto-generated method stub
		return "Tijera";
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		// TODO Auto-generated method stub
		return otraJugada.resolverPapel();
	}

}
