package chatbot;

import java.util.ArrayList;
import java.util.List;

public class ChoicesList extends Choices{
	public List<Choices>choicesList;
	
	public ChoicesList() {
		choicesList = new ArrayList<>();
	}
	
	public void addChoices (Choices choice) {
		choicesList.add(choice);
	}
	
}
