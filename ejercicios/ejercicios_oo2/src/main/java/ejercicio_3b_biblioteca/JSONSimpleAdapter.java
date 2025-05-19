package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter extends VoorheesExporter {
	
	
	// Los datos del socio los volcamos en un JSON
	@SuppressWarnings("unchecked")
	private Object crearJsonSocio(Socio socio) {
		// Creamos el objeto JSON
		JSONObject objectJSON = new JSONObject();
		// Con el .put agregamos el diccionario llave-valor
		objectJSON.put("nombre", socio.getNombre());
		objectJSON.put("email", socio.getEmail());
		objectJSON.put("legajo", socio.getLegajo());
		return objectJSON;
	}
	
	@SuppressWarnings("unchecked")
	@Override // Usamos el override para que reemplace el código de la clase de arrib
	// Recibimos la lista de socios y los transformamos en formato JSON
	public String exportar(List<Socio> socios) {
		JSONArray arrayJSON = new JSONArray();
		// Por cada socio del listado, lo agregamos al array convertido en JSON
		socios.stream().forEach(s -> arrayJSON.add(this.crearJsonSocio(s)));
		// Retornamos el listado JSON en su formato sin tener
		return arrayJSON.toJSONString();
	}
	
}
