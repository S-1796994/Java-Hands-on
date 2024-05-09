package com.practice;

import java.util.Random;
import java.util.Scanner;

public class Advice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		String[] adviceList= {"Take a deep breath and relax","Focus on wht you can control","stay positive","learn from your mistakes"};
		System.out.println("Ask me a question");
		sc.nextLine();
		int randomIndex=random.nextInt(adviceList.length);
		System.out.println("Advice: "+adviceList[randomIndex]);
		sc.close();
	}

}
