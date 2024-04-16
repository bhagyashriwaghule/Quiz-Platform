package com.tms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	        // Sample quiz creation
	        Question question1 = new Question("What is the capital of France?",
	                List.of("Paris", "Rome", "Berlin", "London"), 0);
	        Question question2 = new Question("What is the powerhouse of the cell?",
	                List.of("Mitochondria", "Nucleus", "Ribosome", "Endoplasmic reticulum"), 0);

	        Quiz quiz = new Quiz();
	        quiz.addQuestion(question1);
	        quiz.addQuestion(question2);

	        
	        quiz.conductQuiz();
	    }

	}

