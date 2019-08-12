package com.practice1;

import java.io.IOException;
import java.util.Arrays;

public class ConsonantCheck {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the Character: ");
		Character ch = (char) System.in.read();
		Character[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		if(Arrays.asList(vowels).contains(ch)) {
			System.out.println(ch + " is not a consonant");
		}
		else {
			System.out.println(ch + " is a consonant");
		}
	}
}
