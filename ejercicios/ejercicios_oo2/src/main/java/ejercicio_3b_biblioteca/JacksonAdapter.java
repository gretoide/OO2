package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter extends VoorheesExporter {
	
	@Override
	public String exportar(List<Socio> socios) {
		
		// Creamos el objeto mapper
		ObjectMapper objectMapper = new ObjectMapper();
		String data = "";
		try {
			 data = objectMapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return data;
		
	}
}
