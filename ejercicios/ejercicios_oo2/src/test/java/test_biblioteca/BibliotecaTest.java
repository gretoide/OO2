package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void testAgregarSocio() {
        Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        Socio socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
        assertEquals(0, biblioteca.getSocios().size());
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);
        assertEquals(2, biblioteca.getSocios().size());
    }

    @Test
    public void testExportarSocios() throws ParseException {
        Biblioteca biblioteca = new Biblioteca();
        Socio socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
        Socio socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
        biblioteca.agregarSocio(socio1);
        biblioteca.agregarSocio(socio2);

        String resultadoEsperado = "[{\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\",\"legajo\":\"5234-5\"},{\"nombre\":\"Tyron Lannister\",\"email\":\"tyron@thelannisters.com\",\"legajo\":\"2345-2\"}]";

        JSONParser parser = new JSONParser();
        // Creamos objetos JSON para comparar entre mismos objetos
        JSONArray expectedArray = (JSONArray) parser.parse(resultadoEsperado);
        JSONArray actualArray = (JSONArray) parser.parse(biblioteca.exportarSocios());

        assertEquals(expectedArray, actualArray);
    }
}
