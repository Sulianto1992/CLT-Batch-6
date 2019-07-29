package day10;

import java.util.Scanner;

public class OnlineQuiz {

  public class Question {

		String prompt;
		String answer;
		
		public Question (String prompt, String answer) {
			this.prompt = prompt;
			this.answer = answer;
		}

  }

  public static void takeQuiz(Question [] questions) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = sc.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You got " + score + "/" + questions.length);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the online quiz!");
		System.out.println("If you are ready, let's begin!!");
		
		String question1 = "What colour of the traffic light indicates STOP?";
		String question2 = "What colour of the traffic light indicates STOP?";
		
		Question [] questions = { 
				new Question(question1, "a"), new Question(question2, "b")
		};
		takeQuiz(questions);
		
		
	
		

	}

}
