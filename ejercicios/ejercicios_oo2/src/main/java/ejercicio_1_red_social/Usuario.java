package Ejercicio_1_Red_Social;
import java.util.ArrayList;
import java.util.List;


public class Usuario {
	private String screenName;
	public List<Tweet> tweets;
	
	public Usuario(String unScreenName) {
		this.screenName = unScreenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public void realizarTweet(String unTexto) {
		if (this.verificarLongitud(unTexto)) {
			Tweet tweet = new Tweet(unTexto);
	        this.tweets.add(tweet);
		}
	}
	
	public void realizarRetweet(Tweet unTweetOriginal) {
		Retweet retweet = new Retweet(unTweetOriginal);
		this.tweets.add(retweet);
	}
	
	protected void eliminarTweets() {
		this.tweets.clear();
	}
	
	public String getScreenName() {
		return screenName;
	}

	protected void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	protected boolean verificarLongitud(String unTexto) {
	    if (unTexto.length() > 1 && unTexto.length() <= 280) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
