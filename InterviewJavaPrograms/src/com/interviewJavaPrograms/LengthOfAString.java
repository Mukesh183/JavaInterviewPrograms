package com.interviewJavaPrograms;

import java.util.Scanner;


public class LengthOfAString {

	public static void main(String[] args) {

		String stringValue="Automation";
		System.out.println("using bulitin function: "+stringValue.length());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String stringValue2 = sc.nextLine();
		int lengthOfString = 0;
		for(int i=0;i<stringValue2.length();i++) {
			lengthOfString++;
		}
		System.out.println("Without builtin String: "+lengthOfString);

	}

}
