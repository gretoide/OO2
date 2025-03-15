package Ejercicio_1_Red_Social;

public class Tweet {
	private String texto;
	
	public Tweet(String unTexto) {
		this.setTexto(unTexto); 
	}

	public Tweet() {
	}

	@SuppressWarnings("unused")
	public String getTexto() {
		return texto;
	}

	private void setTexto(String texto) {
		this.texto = texto;
	}
}
