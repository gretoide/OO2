package test_piedra_papel_tijera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio_2_piedra_papel_tijera.Juego;
import ejercicio_2_piedra_papel_tijera.Jugador;
import ejercicio_2_piedra_papel_tijera.Papel;
import ejercicio_2_piedra_papel_tijera.Piedra;
import ejercicio_2_piedra_papel_tijera.Tijera;

public class testPiedraPapelTijera {
    private Juego juego;
    private Jugador jugador1;
    private Jugador jugador2;

    @BeforeEach
    void setUp() {
        juego = new Juego();
        jugador1 = new Jugador("Alice");
        jugador2 = new Jugador("Bob");
    }

    @Test
    void piedraVsTijeraDebeGanarPiedra() {
        jugador1.setMiJugada(new Piedra());
        jugador2.setMiJugada(new Tijera());
        assertEquals("Resultado: Piedra", juego.jugar(jugador1, jugador2));
    }

    @Test
    void piedraVsPapelDebeGanarPapel() {
        jugador1.setMiJugada(new Piedra());
        jugador2.setMiJugada(new Papel());
        assertEquals("Resultado: Papel", juego.jugar(jugador1, jugador2));
    }

    @Test
    void tijeraVsPapelDebeGanarTijera() {
        jugador1.setMiJugada(new Tijera());
        jugador2.setMiJugada(new Papel());
        assertEquals("Resultado: Tijera", juego.jugar(jugador1, jugador2));
    }

    @Test
    void papelVsPapelDebeSerEmpate() {
        jugador1.setMiJugada(new Papel());
        jugador2.setMiJugada(new Papel());
        assertEquals("Resultado: Empate", juego.jugar(jugador1, jugador2));
    }

    @Test
    void piedraVsPiedraDebeSerEmpate() {
        jugador1.setMiJugada(new Piedra());
        jugador2.setMiJugada(new Piedra());
        assertEquals("Resultado: Empate", juego.jugar(jugador1, jugador2));
    }

    @Test
    void tijeraVsTijeraDebeSerEmpate() {
        jugador1.setMiJugada(new Tijera());
        jugador2.setMiJugada(new Tijera());
        assertEquals("Resultado: Empate", juego.jugar(jugador1, jugador2));
    }
}
