package com.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int numberToGuess=random.nextInt(100)+1; //Random number between q1 and 100
		int guess;
		do {
			System.out.println("Guess the number");
			guess=sc.nextInt();
			if(guess<numberToGuess) {
				System.out.println("Too low Try again");
			}
			else if(guess>numberToGuess) {
				System.out.println("Too high. Try again.");
			}
		}while(guess!=numberToGuess);
		System.out.println("congratulations! You guessed Correct number");
		sc.close();
		
	
	}

}
