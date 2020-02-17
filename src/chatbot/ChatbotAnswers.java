package chatbot;

public class ChatbotAnswers {
	Choices choices = new Choices();
	
	public void userChoosesJoke(){
		System.out.println("ROBOT: Here's a joke for you: "+choices.getJoke());
	
		
	}
	public void myJobIsDone() {
		System.out.println("ROBOT: Well, that's great - my job here is done! Keep being awesome! Let's talk another time! :)");
	}
	
	public void userChoosesMeme() {
		System.out.println("ROBOT: Copy this link to see the funniest meme: "+choices.getMeme());
		
	}
	
	public void userChoosesRecipe() {
		System.out.println("ROBOT: This is the best recipe I know! You have to try it now! "+choices.getRecipe());
		
	}
	
	public void didThisHelp() {
		System.out.println("ROBOT: Did this help?");
	}

}
