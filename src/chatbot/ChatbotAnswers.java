package chatbot;

public class ChatbotAnswers {
	Choices choices = new Choices();

	public void sadMood() {
		System.out.println("ROBOT: Ohhhh... I will try to make your day better!");
		System.out.println("ROBOT: Let me know what would be the best way to cheer you up!");
		System.out.println("ROBOT: Enter your choice: Joke/ Meme/ Song ");

	}

	public void greatMood() {
		System.out.println("ROBOT: That's great!");
		System.out.println("ROBOT: Wanna have more fun? Enter: Yes/ No");

	}
	
	public void chooseOne() {
		System.out.println("ROBOT: Awesome! Choose one: Joke/ Meme/ Song ");
	}

	public void fineMood() {
		System.out.println("ROBOT: Hmmm....I will try to make your day better!");
		System.out.println("ROBOT: Let me know what would be the best way to cheer you up!");
		System.out.println("ROBOT: Enter your choice: Joke/ Meme/ Song ");

	}

	public void userChoosesJoke() {
		System.out.println("ROBOT: Here's a joke for you: " + choices.getJoke());

	}

	public void myJobIsDone() {
		System.out.println(
				"ROBOT: Well, that's great - my job here is done! Keep being awesome! Let's talk another time! :)");
	}

	public void userChoosesMeme() throws Exception {
		System.out.println("ROBOT: This is one of the funniest memes out there: ");
		Thread.sleep(3000);
		choices.getMeme();

	}
	
	public void userChoosesSong() throws Exception {
		System.out.println("ROBOT: This song will defineteley cheer you up! Check it out:  ");
		Thread.sleep(3000);
		choices.getSong();

	}

	public void didThisHelp() {
		System.out.println("ROBOT: Did this help?");
	}
	
	public void letsTryTomorrow() {
		System.out.println("ROBOT: Oh, no! That is too bad! Let's try tomorrow!");
		
	}
	
	public void elseMemeSong() {
		System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? Choose one: Meme/ Song ");
	}
	public void elseSong() throws Exception {
		System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? This Song is my last chance: ");
		Thread.sleep(3000);
		choices.getSong();
	}
	
	public void elseMeme() throws Exception {
		System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? This Meme is my last chance: ");
		Thread.sleep(3000);
		choices.getMeme();

	}
	
	public void elseJoke() {
		System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? This Joke is my last chance: "	+ choices.getJoke());
	}
	
	public void elseJokeMeme() {
		System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? Choose one: Joke/ Meme ");
	}
	
	public void elseJokeSong() {
		System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? Choose one: Joke/ Song ");
	}
	

}
