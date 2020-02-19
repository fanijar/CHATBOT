package chatbot;

import java.awt.Desktop;
import java.net.URI;

public class Choices {
	public String joke = "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.";
	public String meme;
	public String song = "song";
	
	
	
	public String getJoke() {
		return joke;
	}
	
	public void getMeme() throws Exception {
		String links = "https://meme.xyz/uploads/posts/t/l-15462-who-would-win-a-computer-program-with-millions-of-lines-of-code-one-curlyboy-with-no-friend.jpg";
		Desktop d = Desktop.getDesktop();
		d.browse(new URI(links));

	}
	public void getSong() throws Exception {
		String links = "https://www.youtube.com/watch?v=o1eHKf-dMwo";
		Desktop d = Desktop.getDesktop();
		d.browse(new URI(links));

	}
	
}