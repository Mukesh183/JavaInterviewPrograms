package com.interviewJavaPrograms;

import java.util.Arrays;

import java.util.HashSet;

public class FindMissingAlphabetInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="Mukesh Perumal";
		value=value.toLowerCase();
		value.replaceAll(" ", "");
		String[] arrayValue=value.split("");
		System.out.println(value);
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		String[] arrayAlphabets=alphabets.split("");
		HashSet<String> compare1 = new HashSet<String>(Arrays.asList(arrayValue));
		/*
		 * for (String string : arrayValue) { compare1.add(string) }
		 */
		HashSet<String> compare2 = new HashSet<String>(Arrays.asList(arrayAlphabets));
		compare2.removeAll(compare1);
		System.out.println(compare2);

	}

}
