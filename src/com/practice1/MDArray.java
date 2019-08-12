package com.practice1;

import java.util.Random;
import java.util.Scanner;

public class MDArray {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for Array: ");
		int xDim = sc.nextInt();
		
		System.out.println("Enter number of cols for Array: ");
		int yDim = sc.nextInt();
		
		int[][] randArray = new int[xDim][yDim];
		
		for(int i=0; i < randArray.length; i++) {
			for(int j=0; j < randArray[i].length; j++) {
				randArray[i][j] = random.nextInt(100);
			}
		}
		
		System.out.println("Random Array: ");
		for(int i=0; i < randArray.length; i++) {
			for(int j=0; j < randArray[i].length; j++) {
				System.out.print(randArray[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
