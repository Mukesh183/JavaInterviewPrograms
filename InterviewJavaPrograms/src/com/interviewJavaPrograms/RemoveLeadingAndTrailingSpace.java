package com.interviewJavaPrograms;

public class RemoveLeadingAndTrailingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="  Mukesh Perumal  ";
		//System.out.println(name);
		//System.out.println(name.trim());
		//use strip() but in Java11 only they introduce
		//stripLeading()->for start
		//stripTrailing()->for end
		//System.out.println(name.strip());
		//using regex
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", ""));//-->leading and trailing
		System.out.println(name.replaceAll("^[ \t]+", ""));//-->leading 
		System.out.println(name.replaceAll("[ \t]+$", ""));//--> trailing
	}

}
