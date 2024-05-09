package com.practice;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Number");
		int start=sc.nextInt();
		System.out.println("Enter end Number");
		int end=sc.nextInt();
		sc.close();
		
		while(start<=end) {
			System.out.println(start);
			start++;
		}
	}

}
