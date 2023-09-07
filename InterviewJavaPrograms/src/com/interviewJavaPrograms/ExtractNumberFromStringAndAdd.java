package com.interviewJavaPrograms;

public class ExtractNumberFromStringAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Mukesh183";
		int total=0;
		int lengthOfString = name.length();
		for(int i=0;i<lengthOfString;i++) {
			char charValue=name.charAt(i);
			if(Character.isDigit(charValue)) {
				total=total+Character.getNumericValue(charValue);
			}
		}
		System.out.println(total);
	}

}
