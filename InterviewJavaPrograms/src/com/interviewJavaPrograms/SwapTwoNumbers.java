package com.interviewJavaPrograms;

public class SwapTwoNumbers {

	public void WithThreeValues() {
		int first,second,temp;
		first=18;
		second=23;
		System.out.println("before swap: First: "+first+" second: "+second);
		temp=first;
		first=second;
		second=temp;
		System.out.println("after swap: First: "+first+" second: "+second);
		System.out.println("------------------------------------------------------------------------");
	}
	
	public void WithoutThreeValues() {
		int first,second;
		first=72;
		second=43;
		System.out.println("before swap: First: "+first+" second: "+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("after swap: First: "+first+" second: "+second);
		System.out.println("------------------------------------------------------------------------");
	}
	
	public void MultipleAndDivide() {
		int first,second;
		first=64;
		second=8;
		System.out.println("before swap: First: "+first+" second: "+second);
		first = first*second;
		second = first/second;
		first= first/second;
		System.out.println("after swap: First: "+first+" second: "+second);
	}

	public static void main(String[] args) {

		SwapTwoNumbers numbers = new SwapTwoNumbers();
		numbers.WithThreeValues();
		numbers.WithoutThreeValues();
		numbers.MultipleAndDivide();

	}

}
