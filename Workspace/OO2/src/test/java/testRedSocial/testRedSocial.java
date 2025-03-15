package testRedSocial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio_1_Red_Social.Retweet;
import Ejercicio_1_Red_Social.Tweet;
import Ejercicio_1_Red_Social.Twitter;
import Ejercicio_1_Red_Social.Usuario;

import java.util.List;

public class testRedSocial {
    private Twitter twitter;
    private Usuario usuario1;
    private Usuario usuario2;

    @BeforeEach
    void setUp() {
        twitter = new Twitter();
        usuario1 = twitter.cargarUsuario("user1");
        usuario2 = twitter.cargarUsuario("user2");
    }

    // 🟢 Test Twitter
    @Test
    void testCargarUsuario() {
        assertNotNull(usuario1);
        assertEquals("user1", usuario1.getScreenName());
    }

    @Test
    void testNoPermiteUsuariosDuplicados() {
        Usuario usuarioRepetido = twitter.cargarUsuario("user1");
        assertNull(usuarioRepetido);
    }

    @Test
    void testEliminarUsuario() {
        twitter.cargarUsuario(usuario1); // Elimina sus tweets y lo quita de la lista
        assertFalse(twitter.getUsuarios().contains(usuario1));
    }

    // 🟢 Test Usuario
    @Test
    void testRealizarTweet() {
        usuario1.realizarTweet("Hola mundo");
        assertEquals(1, usuario1.tweets.size());
    }

    @Test
    void testNoPermiteTweetsMuyCortos() {
        usuario1.realizarTweet("");
        assertEquals(0, usuario1.tweets.size());
    }

    @Test
    void testNoPermiteTweetsMuyLargos() {
        String textoLargo = "a".repeat(281);
        usuario1.realizarTweet(textoLargo);
        assertEquals(0, usuario1.tweets.size());
    }

    @Test
    void testRealizarRetweet() {
        Tweet tweetOriginal = new Tweet("Este es un tweet");
        usuario1.realizarRetweet(tweetOriginal);
        assertEquals(1, usuario1.tweets.size());
        assertTrue(usuario1.tweets.get(0) instanceof Retweet);
    }

    // 🟢 Test Retweet
    @Test
    void testRetweetGuardaTweetOriginal() {
        Tweet original = new Tweet("Este es el tweet original");
        Retweet retweet = new Retweet(original);
        assertNotNull(retweet);
    }

    // 🟢 Test Tweet
    @Test
    void testCrearTweet() {
        Tweet tweet = new Tweet("Un tweet normal");
        assertNotNull(tweet);
    }

    @Test
    void testTweetGuardaTexto() {
        Tweet tweet = new Tweet("Probando");
        assertEquals("Probando", tweet.getTexto());
    }
}
