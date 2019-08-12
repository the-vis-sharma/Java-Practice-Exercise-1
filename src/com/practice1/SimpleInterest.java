package com.practice1;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		float principal = sc.nextFloat();
		
		System.out.println("Enter Months: ");
		int months = sc.nextInt();
		
		System.out.println("Enter Interest Rate: ");
		float rate = sc.nextFloat();
		
		float simpleInterest = (principal * months * rate) / 100;
		System.out.println("Simple Interest: " + simpleInterest);
		
		sc.close();
	}
}
