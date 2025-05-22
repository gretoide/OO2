package ejercicio_x_piedra_papel_tijera;

public class Tijera implements Jugada {

	@Override
	public String resolverPiedra() {
		// TODO Auto-generated method stub
		return "Piedra";
	}

	@Override
	public String resolverPapel() {
		// TODO Auto-generated method stub
		return "Tijera";
	}

	@Override
	public String resolverTijera() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		// TODO Auto-generated method stub
		return otraJugada.resolverTijera();
	}

}
