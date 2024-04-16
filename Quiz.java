package com.tms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
	 private List<Question> questions;

	    public Quiz() {
	        questions = new ArrayList<>();
	    }

	    public void addQuestion(Question question) {
	        questions.add(question);
	    }

	    public void conductQuiz() {
	        Scanner scanner = new Scanner(System.in);
	        int score = 0;

	        for (Question question : questions) {
	            System.out.println(question.getQuestionText());
	            List<String> options = question.getOptions();
	            for (int i = 0; i < options.size(); i++) {
	                System.out.println((i + 1) + ". " + options.get(i));
	            }
	            System.out.print("Enter your choice: ");
	            int userChoice = scanner.nextInt();
	            if (userChoice == question.getCorrectOptionIndex() + 1) {
	                System.out.println("Correct!");
	                score++;
	            } else {
	                System.out.println("Incorrect!");
	            }
	        }

	        System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
	    }


}


   
