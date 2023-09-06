package com.interviewJavaPrograms;

public class VowelsCountInName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Mukesh Perumal";
		int vowelCount=0;
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
	}

}
