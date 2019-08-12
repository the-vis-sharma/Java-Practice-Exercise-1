package com.practice1;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		String num = sc.next();
		char[] digitArray = num.toCharArray();
		
		double sum = 0;
		for(char ch : digitArray) {
			sum += Math.pow(Character.getNumericValue(ch), digitArray.length);
		}
		
		if(Double.parseDouble(num) == sum) {
			System.out.println("Number is Armstrong.");
		}
		else {
			System.out.println("Number is not Armstrong.");
		}
		
		sc.close();
		
	}
}
