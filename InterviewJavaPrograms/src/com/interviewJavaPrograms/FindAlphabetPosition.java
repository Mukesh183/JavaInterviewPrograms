package com.interviewJavaPrograms;

import java.util.Scanner;

public class FindAlphabetPosition {
	//ASCII->65-A, 97-a
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char givenChar = sc.next().charAt(0);
		char lowercaseChar=Character.toLowerCase(givenChar);
		int intChar=(int)lowercaseChar;
		intChar=intChar-96;
		System.out.println(intChar);
	}

}
