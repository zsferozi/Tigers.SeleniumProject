package launchBrowser;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Developing a simple report card with five subjects
		// It is a program that takes marks of 5 subjects from the user and
		// returns the
		// total, percentage, highest number scored, average, and grade.
		Scanner userInput = new Scanner(System.in);
		System.out.println("ANNUAL EXAMINATION RESUTLS \n");
		double subject1, subject2, subject3, subject4, subject5;
		System.out.println("Enter the marks for mathmatics: ");
		subject1 = userInput.nextDouble();

		if (subject1 < 0 || subject1 > 100) {
			System.out.println("Values must be equal or less than 100, again!");
		} else {
			System.out.println("Enter the marks for science: ");
		}
		subject2 = userInput.nextDouble();

		if (subject2 < 0 || subject2 > 100) {
			System.out.println("Values must be equal or less than 100, again!");
		} else {
			System.out.println("Enter the marks for Social studies: ");
		}
		subject3 = userInput.nextDouble();
		if (subject3 < 0 || subject3 > 100) {
			System.out.println("Values must be equal or less than 100, again!");
		} else {
			System.out.println("Enter the marks for computer studies: ");
		}
		subject4 = userInput.nextDouble();
		if (subject4 < 0 || subject4 > 100) {
			System.out.println("Values must be equal or less than 100, again!");
		} else {
			System.out.println("Enter the marks for language art: ");
		}
		subject5 = userInput.nextDouble();
		if (subject5 < 0 || subject5 > 100) {
			System.out.println("Values must be equal or less than 100, again!");
		} else {
			System.out.println("\n");
			System.out.println("THE RESULT IS: ");
		}

		userInput.close();

		// Total of

		double totalMarksOfFiveSubs = subject1 + subject2 + subject3 + subject4 + subject5;

		System.out.println("Total marks of the five subjects: " + totalMarksOfFiveSubs);

		System.out.println("----------------------");
		// Percentage

		double percentage = totalMarksOfFiveSubs / 500 * 100;

		System.out.println("Percentage: " + "%" + percentage);

		System.out.println("----------------------");

		// Highest marks

		if (subject1 > subject2 && subject1 > subject3 && subject1 > subject4 && subject1 > subject5) {

			System.out.println("Highest mark scored: " + subject1);

			System.out.println("----------------------");

		} else if (subject2 > subject1 && subject2 > subject3 && subject2 > subject4 && subject2 > subject5) {

			System.out.println("Highest mark scored: " + subject2);

			System.out.println("----------------------");

		} else if (subject3 > subject1 && subject3 > subject2 && subject3 > subject4 && subject3 > subject5) {

			System.out.println("Highest mark scored: " + subject3);

			System.out.println("----------------------");

		} else if (subject4 > subject1 && subject4 > subject2 && subject4 > subject3 && subject4 > subject5) {

			System.out.println("Highest mark scored: " + subject4);

			System.out.println("----------------------");

		} else {

			System.out.println("Highest mark scored: " + subject5);

			System.out.println("----------------------");

		}

		// Average

		double averageMarks = totalMarksOfFiveSubs / 5;

		System.out.println("Average marks: " + averageMarks);

		System.out.println("----------------------");

		// Remarks

		if (percentage <= 40) {

			System.out.println("Remarks: You are failed!");

			System.out.println("----------------------");

		} else if (percentage > 40 && percentage <= 50) {

			System.out.println("Your grade is: " + "\"D\"");

			System.out.println("----------------------");

		} else if (percentage > 50 && percentage <= 60) {

			System.out.println("Your grade: " + "\"C\"");

			System.out.println("----------------------");

		} else if (percentage > 60 && percentage <= 80) {

			System.out.println("Your grade: " + "\"B\"");

			System.out.println("----------------------");

		} else if (percentage > 80 && percentage <= 90) {

			System.out.println("Your grade: " + "\"A\"");

			System.out.println("----------------------");

		} else if (percentage > 90 && percentage <= 100) {

			System.out.println("Your grade: " + "\"A+\"");

			System.out.println("----------------------");

		} else {

			System.out.println("Try again!");
		}
	}
}