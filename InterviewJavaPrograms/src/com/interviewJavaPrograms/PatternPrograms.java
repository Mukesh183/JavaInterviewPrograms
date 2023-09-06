package com.interviewJavaPrograms;

import java.util.Scanner;

public class PatternPrograms {
	
	public void FloydProgram() {
		int row,column;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the limit size: ");
		int limitSize = scanner.nextInt();
		for(row=0;row<limitSize;row++) {
			for(column=0;column<=row;column++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}System.out.println("______________________________________________________");
		
	}
	
	public void FloydWithNumbers() {
		int row,column;
		int numbers=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the limit size: ");
		int limitSize=scanner.nextInt();
		for(row=0;row<limitSize;row++) {
			for(column=0;column<=row;column++) {
				System.out.print(numbers+" ");
				numbers++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrograms programs = new PatternPrograms();
		programs.FloydProgram();
		programs.FloydWithNumbers();

	}

}
