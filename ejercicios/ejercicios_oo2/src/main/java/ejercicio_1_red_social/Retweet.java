package Ejercicio_1_Red_Social;

public class Retweet extends Tweet {
	private Tweet tweetOriginal;
	
	public Retweet(Tweet unTweetOriginal) {
		super();
		this.tweetOriginal = unTweetOriginal;
	}

	@SuppressWarnings("unused")
	private Tweet getTweetOriginal() {
		return tweetOriginal;
	}

	@SuppressWarnings("unused")
	private void setTweetOriginal(Tweet tweetOriginal) {
		this.tweetOriginal = tweetOriginal;
	};
}
