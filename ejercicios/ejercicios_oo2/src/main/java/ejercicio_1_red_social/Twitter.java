package Ejercicio_1_Red_Social;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.setUsuarios(new ArrayList<Usuario>());
	}
	
	public Usuario cargarUsuario(String screenName) {
		if (buscarUsuario(screenName)) {
			Usuario usuario = new Usuario(screenName);
			getUsuarios().add(usuario);
			return usuario;
		}
		return null;
	}
	
	public void cargarUsuario(Usuario usuario) {
		usuario.eliminarTweets();
		getUsuarios().remove(usuario);
	}
	
	
	private boolean buscarUsuario(String screenName) {
		return this.getUsuarios().stream().noneMatch(usuario -> usuario.getScreenName().equals(screenName));
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
