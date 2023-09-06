package com.interviewJavaPrograms;

public class ReverseWordInSentance {

	public static void main(String[] args) {
		String whatsYourName="My Name is Mukesh Perumal";
		String reverse = "";
		String splitWords[]=whatsYourName.split(" ");
		for(int i=splitWords.length-1;i>=0;i--) {
			reverse=reverse+splitWords[i]+" ";
		}
		System.out.println(reverse);
	}

}
