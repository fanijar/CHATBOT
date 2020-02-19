package chatbot;

import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args) throws Exception {

		ChatbotAnswers answers = new ChatbotAnswers();

		System.out.println("ROBOT: Hello!");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("ROBOT: Tell me how is your day? (Enter: Great/ Fine/ Sad)");

		String mood = sc.nextLine();

		// String arr [] = {"Fine", "Good", "Sad"};
		boolean keepGoing = true;
		while (keepGoing) {
			if (mood.equalsIgnoreCase("Fine")) {
				answers.fineMood();
				String choice = sc.nextLine();
				if (choice.equalsIgnoreCase("Joke")) {
					answers.userChoosesJoke();
					answers.didThisHelp();
					String answer = sc.nextLine();
					if (answer.equalsIgnoreCase("Yes")) {
						answers.myJobIsDone();
						break;
					} else if (answer.equalsIgnoreCase("No")) {
						answers.elseMemeSong();
						String choice1 = sc.nextLine();
						if (choice1.equalsIgnoreCase("Meme")) {
							answers.userChoosesMeme();
							answers.didThisHelp();
							String answer1 = sc.nextLine();
							if (answer1.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer1.equalsIgnoreCase("No")) {
								answers.elseSong();
								answers.didThisHelp();
								String answer2 = sc.nextLine();
								if (answer2.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer2.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						} else if (choice1.equalsIgnoreCase("Song")) {
							answers.userChoosesSong();
							answers.didThisHelp();
							String answer3 = sc.nextLine();
							if (answer3.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer3.equalsIgnoreCase("No")) {
								answers.elseMeme();
								answers.didThisHelp();
								String answer4 = sc.nextLine();
								if (answer4.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer4.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						}
					}

				} else if (choice.equalsIgnoreCase("Meme")) {
					answers.userChoosesMeme();
					answers.didThisHelp();
					String answer5 = sc.nextLine();
					if (answer5.equalsIgnoreCase("Yes")) {
						answers.myJobIsDone();
						break;
					} else if (answer5.equalsIgnoreCase("No")) {
						answers.elseJokeSong();
						String choice2 = sc.nextLine();
						if (choice2.equalsIgnoreCase("Joke")) {
							answers.userChoosesJoke();
							answers.didThisHelp();
							String answer6 = sc.nextLine();
							if (answer6.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer6.equalsIgnoreCase("No")) {
								answers.elseSong();
								answers.didThisHelp();
								String answer7 = sc.nextLine();
								if (answer7.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer7.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						} else if (choice2.equalsIgnoreCase("Song")) {
							answers.userChoosesSong();
							answers.didThisHelp();
							String answer8 = sc.nextLine();
							if (answer8.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer8.equalsIgnoreCase("No")) {
								answers.elseJoke();
								answers.didThisHelp();
								String answer9 = sc.nextLine();
								if (answer9.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer9.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						}
					}

				} else if (choice.equalsIgnoreCase("Song")) {
					answers.userChoosesSong();
					answers.didThisHelp();
					String answer10 = sc.nextLine();
					if (answer10.equalsIgnoreCase("Yes")) {
						answers.myJobIsDone();
						break;
					} else if (answer10.equalsIgnoreCase("No")) {
						answers.elseJokeMeme();
						String choice3 = sc.nextLine();
						if (choice3.equalsIgnoreCase("Joke")) {
							answers.userChoosesJoke();
							answers.didThisHelp();
							String answer11 = sc.nextLine();
							if (answer11.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer11.equalsIgnoreCase("No")) {
								answers.elseMeme();
								answers.didThisHelp();
								String answer12 = sc.nextLine();
								if (answer12.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer12.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						} else if (choice3.equalsIgnoreCase("Meme")) {
							answers.userChoosesMeme();
							answers.didThisHelp();
							String answer13 = sc.nextLine();
							if (answer13.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer13.equalsIgnoreCase("No")) {
								answers.elseJoke();
								answers.didThisHelp();
								String answer14 = sc.nextLine();
								if (answer14.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer14.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						}
					}
				}

			} else if (mood.equalsIgnoreCase("Great")) {
				answers.greatMood();
				String answer15 = sc.nextLine();
				if (answer15.equalsIgnoreCase("No")) {
					answers.myJobIsDone();
					break;
				} else if (answer15.equalsIgnoreCase("Yes")) {
					answers.chooseOne();
					String choice4 = sc.nextLine();
					if (choice4.equalsIgnoreCase("Joke")) {
						answers.userChoosesJoke();
						answers.didThisHelp();
						String answer16 = sc.nextLine();
						if (answer16.equalsIgnoreCase("Yes")) {
							answers.myJobIsDone();
							break;
						} else if (answer16.equalsIgnoreCase("No")) {
							answers.elseMemeSong();
							String choice5 = sc.nextLine();
							if (choice5.equalsIgnoreCase("Meme")) {
								answers.userChoosesMeme();
								answers.didThisHelp();
								String answer17 = sc.nextLine();
								if (answer17.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer17.equalsIgnoreCase("No")) {
									answers.elseSong();
									answers.didThisHelp();
									String answer18 = sc.nextLine();
									if (answer18.equalsIgnoreCase("Yes")) {
										answers.myJobIsDone();
										break;
									} else if (answer18.equalsIgnoreCase("No")) {
										answers.letsTryTomorrow();
										break;
									}
								}
							} else if (choice5.equalsIgnoreCase("Song")) {
								answers.userChoosesSong();
								answers.didThisHelp();
								String answer19 = sc.nextLine();
								if (answer19.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer19.equalsIgnoreCase("No")) {
									answers.elseMeme();
									answers.didThisHelp();
									String answer20 = sc.nextLine();
									if (answer20.equalsIgnoreCase("Yes")) {
										answers.myJobIsDone();
										break;
									} else if (answer20.equalsIgnoreCase("No")) {
										answers.letsTryTomorrow();
										break;
									}
								}
							}
						}
					} else if (choice4.equalsIgnoreCase("Meme")) {
						answers.userChoosesMeme();
						answers.didThisHelp();
						String answer21 = sc.nextLine();
						if (answer21.equalsIgnoreCase("Yes")) {
							answers.myJobIsDone();
							break;
						} else if (answer21.equalsIgnoreCase("No")) {
							answers.elseJokeSong();
							String choice6 = sc.nextLine();
							if (choice6.equalsIgnoreCase("Joke")) {
								answers.userChoosesJoke();
								answers.didThisHelp();
								String answer22 = sc.nextLine();
								if (answer22.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer22.equalsIgnoreCase("No")) {
									answers.elseSong();
									answers.didThisHelp();
									String answer23 = sc.nextLine();
									if (answer23.equalsIgnoreCase("Yes")) {
										answers.myJobIsDone();
										break;
									} else if (answer23.equalsIgnoreCase("No")) {
										answers.letsTryTomorrow();
										break;
									}
								}
							} else if (choice6.equalsIgnoreCase("Song")) {
								answers.userChoosesSong();
								answers.didThisHelp();
								String answer24 = sc.nextLine();
								if (answer24.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer24.equalsIgnoreCase("No")) {
									answers.elseJoke();
									answers.didThisHelp();
									String answer25 = sc.nextLine();
									if (answer25.equalsIgnoreCase("Yes")) {
										answers.myJobIsDone();
										break;
									} else if (answer25.equalsIgnoreCase("No")) {
										answers.letsTryTomorrow();
										break;
									}
								}
							}
						}

					} else if (choice4.equalsIgnoreCase("Song")) {
						answers.userChoosesSong();
						answers.didThisHelp();
						String answer26 = sc.nextLine();
						if (answer26.equalsIgnoreCase("Yes")) {
							answers.myJobIsDone();
							break;
						} else if (answer26.equalsIgnoreCase("No")) {
							answers.elseJokeMeme();
							String choice7 = sc.nextLine();
							if (choice7.equalsIgnoreCase("Joke")) {
								answers.userChoosesJoke();
								answers.didThisHelp();
								String answer27 = sc.nextLine();
								if (answer27.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer27.equalsIgnoreCase("No")) {
//					answers.elseMeme();
									answers.didThisHelp();
									String answer28 = sc.nextLine();
									if (answer28.equalsIgnoreCase("Yes")) {
										answers.myJobIsDone();
										break;
									} else if (answer28.equalsIgnoreCase("No")) {
										answers.letsTryTomorrow();
										break;
									}
								}
							} else if (choice7.equalsIgnoreCase("Meme")) {
								answers.userChoosesMeme();
								answers.didThisHelp();
								String answer29 = sc.nextLine();
								if (answer29.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer29.equalsIgnoreCase("No")) {
									answers.elseJoke();
									answers.didThisHelp();
									String answer30 = sc.nextLine();
									if (answer30.equalsIgnoreCase("Yes")) {
										answers.myJobIsDone();
										break;
									} else if (answer30.equalsIgnoreCase("No")) {
										answers.letsTryTomorrow();
										break;
									}
								}
							}
						}
					}

				}
			} else if (mood.equalsIgnoreCase("Sad")) {
				answers.sadMood();
				String choice8 = sc.nextLine();
				if (choice8.equalsIgnoreCase("Joke")) {
					answers.userChoosesJoke();
					answers.didThisHelp();
					String answer32 = sc.nextLine();
					if (answer32.equalsIgnoreCase("Yes")) {
						answers.myJobIsDone();
						break;
					} else if (answer32.equalsIgnoreCase("No")) {
						answers.elseMemeSong();
						String choice9 = sc.nextLine();
						if (choice9.equalsIgnoreCase("Meme")) {
							answers.userChoosesMeme();
							answers.didThisHelp();
							String answer33 = sc.nextLine();
							if (answer33.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer33.equalsIgnoreCase("No")) {
								answers.elseSong();
								answers.didThisHelp();
								String answer34 = sc.nextLine();
								if (answer34.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer34.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						} else if (choice9.equalsIgnoreCase("Song")) {
							answers.userChoosesSong();
							answers.didThisHelp();
							String answer35 = sc.nextLine();
							if (answer35.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer35.equalsIgnoreCase("No")) {
								answers.elseMeme();
								answers.didThisHelp();
								String answer36 = sc.nextLine();
								if (answer36.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer36.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						}
					}
				} else if (choice8.equalsIgnoreCase("Meme")) {
					answers.userChoosesMeme();
					answers.didThisHelp();
					String answer37 = sc.nextLine();
					if (answer37.equalsIgnoreCase("Yes")) {
						answers.myJobIsDone();
						break;
					} else if (answer37.equalsIgnoreCase("No")) {
						answers.elseJokeSong();
						String choice10 = sc.nextLine();
						if (choice10.equalsIgnoreCase("Joke")) {
							answers.userChoosesJoke();
							answers.didThisHelp();
							String answer38 = sc.nextLine();
							if (answer38.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer38.equalsIgnoreCase("No")) {
								answers.elseSong();
								answers.didThisHelp();
								String answer39 = sc.nextLine();
								if (answer39.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer39.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						} else if (choice10.equalsIgnoreCase("Song")) {
							answers.userChoosesSong();
							answers.didThisHelp();
							String answer40 = sc.nextLine();
							if (answer40.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer40.equalsIgnoreCase("No")) {
								answers.elseJoke();
								answers.didThisHelp();
								String answer41 = sc.nextLine();
								if (answer41.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer41.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						}
					}

				} else if (choice8.equalsIgnoreCase("Song")) {
					answers.userChoosesSong();
					answers.didThisHelp();
					String answer42 = sc.nextLine();
					if (answer42.equalsIgnoreCase("Yes")) {
						answers.myJobIsDone();
						break;
					} else if (answer42.equalsIgnoreCase("No")) {
						answers.elseJokeMeme();
						String choice11 = sc.nextLine();
						if (choice11.equalsIgnoreCase("Joke")) {
							answers.userChoosesJoke();
							answers.didThisHelp();
							String answer43 = sc.nextLine();
							if (answer43.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer43.equalsIgnoreCase("No")) {
								answers.elseMeme();
								answers.didThisHelp();
								String answer44 = sc.nextLine();
								if (answer44.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer44.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						} else if (choice11.equalsIgnoreCase("Meme")) {
							answers.userChoosesMeme();
							answers.didThisHelp();
							String answer45 = sc.nextLine();
							if (answer45.equalsIgnoreCase("Yes")) {
								answers.myJobIsDone();
								break;
							} else if (answer45.equalsIgnoreCase("No")) {
								answers.elseJoke();
								answers.didThisHelp();
								String answer46 = sc.nextLine();
								if (answer46.equalsIgnoreCase("Yes")) {
									answers.myJobIsDone();
									break;
								} else if (answer46.equalsIgnoreCase("No")) {
									answers.letsTryTomorrow();
									break;
								}
							}
						}
					}
				}
			} else {
				System.out.println("ROBOT: I don't understand you! Bye! Have a great day! ");
				break;

			}

		}
	}
}
