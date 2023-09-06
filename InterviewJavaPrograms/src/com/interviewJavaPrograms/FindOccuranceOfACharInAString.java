package com.interviewJavaPrograms;

public class FindOccuranceOfACharInAString {
	public void usingIteration() {
		String name = "Mukesh Perumal Munusammy";
		char occurChar = 'u';
		name=name.toLowerCase();
		int occurTimes=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==occurChar) {
				occurTimes++;
			}
		}
		System.out.println("There are "+occurTimes+" times occured");
	}
	
	public void withoutUsingIteration() {
		String name = "SivaPriya Sangeetha Manonmani";
		char occurChar='a';
		name=name.toUpperCase();
		String occurString=Character.toString(occurChar).toUpperCase();
		int actualLength=name.length();
		System.out.println(actualLength);
		name=name.replace(occurString, "");
		int replacedLength=name.length();
		System.out.println(replacedLength);
		System.out.println(actualLength-replacedLength);
	}
	public static void main(String[] args) {
		FindOccuranceOfACharInAString string = new FindOccuranceOfACharInAString();
		//string.usingIteration();
		string.withoutUsingIteration();
	}

}
