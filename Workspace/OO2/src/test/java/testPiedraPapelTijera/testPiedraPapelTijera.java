package testPiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio_2_Piedra_Papel_Tijera.Juego;
import Ejercicio_2_Piedra_Papel_Tijera.Jugador;
import Ejercicio_2_Piedra_Papel_Tijera.Papel;
import Ejercicio_2_Piedra_Papel_Tijera.Piedra;
import Ejercicio_2_Piedra_Papel_Tijera.Tijera;

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
