package chatbot;

import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args) {

		System.out.println("ROBOT: Hello!");
		Scanner sc = new Scanner(System.in);
		MoodAnswer moodClass = new MoodAnswer();
		

		sc.nextLine();

		System.out.println("ROBOT: Tell me how is your day? (Enter: Great/ Good/ Fine/ Sad)");

		String mood = sc.nextLine();

		// String arr [] = {"Fine", "Good", "Sad"};
		boolean keepGoing = true;
		while (keepGoing) {
			String joke1 = "hahahahaa";//we have to replace this with an actual joke
			String joke2 = "hahahahahahahaah";//we have to replace this with an actual joke
			if (mood.equalsIgnoreCase("Fine")) {
			moodClass.fineMood();
				String choice = sc.nextLine();
				if (choice.equalsIgnoreCase("Joke")) {
					System.out.println("ROBOT: Here's a joke for you: "+joke1);
					System.out.println("ROBOT: Did this help?");
					String answer = sc.nextLine();
					if (answer.equalsIgnoreCase("Yes")) {
						System.out.println("ROBOT: Well, that's great - my job here is done! Keep being awesome! Let's talk another time! :)");
						break;						
					} else if (answer.equalsIgnoreCase("No")) {
						System.out.println("ROBOT: Oh, no! That is too bad, maybe something else could help? Choose one: Joke/ Meme/ Recipe/ Song ");
						
				}
			} else if (mood.equalsIgnoreCase("Good")) {
				moodClass.goodMood();
				String answer = sc.nextLine();
				if (answer.equalsIgnoreCase("Yes")) {
					System.out.println("ROBOT: Choose one: Joke/ Meme/ Recipe/ Song ");
				} else if (answer.equalsIgnoreCase("No")) {
					System.out.println(
							"ROBOT: Well, that's great - my job here is done! Keep being awesome! Let's talk another time! :)");
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
}}
