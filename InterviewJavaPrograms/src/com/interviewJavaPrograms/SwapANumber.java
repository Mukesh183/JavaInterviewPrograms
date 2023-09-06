package com.interviewJavaPrograms;

import java.util.Scanner;

public class SwapANumber {

	public static void main(String[] args) {

		int reversed=0;
		System.out.print("Enter the number:");
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		while(number!=0) {
			reversed=reversed*10;
			reversed=reversed+number%10;
			number=number/10;
		}
		System.out.println(reversed);
		
	}

}
