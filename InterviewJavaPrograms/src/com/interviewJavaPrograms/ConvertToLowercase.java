package com.interviewJavaPrograms;

public class ConvertToLowercase {

	public static void main(String[] args) {

		String text="Hi I am Mukesh Perumal";
		char[] charText=text.toCharArray();
		for(int i=0;i<text.length();i++) {
			if((charText[i]>=65)&&(charText[i]<=90)){
				charText[i]=(char)(charText[i]+32);
			}
		}
		System.out.println(charText);
	}

}
