package chatbot;

import java.util.List;
import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args) {

		System.out.println("ROBOT: Hello!");
		Scanner sc = new Scanner(System.in);
		MoodAnswer moodClass = new MoodAnswer();
		Choices choices = new Choices();
		ChatbotAnswers answers = new ChatbotAnswers();
		ChoicesList choicesList = new ChoicesList();
		
		System.out.println(choicesList.choicesList);


		sc.nextLine();

		System.out.println("ROBOT: Tell me how is your day? (Enter: Great/ Good/ Fine/ Sad)");

		String mood = sc.nextLine();

		// String arr [] = {"Fine", "Good", "Sad"};
		boolean keepGoing = true;
		while (keepGoing) {
			if (mood.equalsIgnoreCase("Fine")) {
			moodClass.fineMood();
				String choice = sc.nextLine();
				if (choice.equalsIgnoreCase("Joke")) {
					answers.userChoosesJoke();
					answers.didThisHelp();
					String answer = sc.nextLine();
					if (answer.equalsIgnoreCase("Yes")) {
						answers.myJobIsDone();
						break;						
					} else if (answer.equalsIgnoreCase("No")) {
						System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? Choose one: Meme/ Recipe/ Song ");
						String choice1 = sc.nextLine();
						if(choice1.equalsIgnoreCase("Meme")) {
							answers.userChoosesMeme();
							answers.didThisHelp();
							String answer1 = sc.nextLine();
							if (answer1.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;						
							} else if (answer.equalsIgnoreCase("No")) {
								System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? Choose one: Recipe/ Song ");
								String choice2 = sc.nextLine();
								if(choice2.equalsIgnoreCase("Recipe")) {
									answers.userChoosesRecipe();
									answers.didThisHelp();
									String answer2 = sc.nextLine();
									if (answer2.equalsIgnoreCase("Yes")) {
										answers.myJobIsDone();
										break;						
									} else if (answer.equalsIgnoreCase("No")) {
										System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? This Song is my last chance: "+choices.getSong());
										answers.didThisHelp();
										String answer3 = sc.nextLine();
										if (answer3.equalsIgnoreCase("Yes")) {
											answers.myJobIsDone();
											break;						
										} else if (answer.equalsIgnoreCase("No")) {
											System.out.println("ROBOT: Oh, no! That is too bad! Lets try tomorrow!");
											break;
						}
				}
			} else if (mood.equalsIgnoreCase("Good")) {
				moodClass.goodMood();
				String answer4 = sc.nextLine();
				if (answer4.equalsIgnoreCase("Yes")) {
					System.out.println("ROBOT: Choose one: Joke/ Meme/ Recipe/ Song ");
				} else if (answer4.equalsIgnoreCase("No")) {
					answers.myJobIsDone();
					break;
				}
			} else if (mood.equalsIgnoreCase("Sad")) {
				moodClass.sadMood();
				
			} else if (mood.equalsIgnoreCase("Great")) {
				moodClass.greatMood();
			} else {
				System.out.println("ROBOT: Try one more time... Enter please Good/Fine/Sad ");
				// return to question how is your day!!
			}

		}
	}
}
}}}}}
