package ejercicio_x_piedra_papel_tijera;

public class Piedra implements Jugada {

	@Override
	public String resolverPiedra() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String resolverPapel() {
		// TODO Auto-generated method stub
		return "Papel";
	}

	@Override
	public String resolverTijera() {
		// TODO Auto-generated method stub
		return "Piedra";
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		// TODO Auto-generated method stub
		return otraJugada.resolverPiedra();
	}

}
