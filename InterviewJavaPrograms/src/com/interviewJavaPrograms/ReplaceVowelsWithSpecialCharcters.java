package com.interviewJavaPrograms;

public class ReplaceVowelsWithSpecialCharcters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cricket="Cricket World Cup 2023 Host is India";
		char[]splChar=cricket.toCharArray();
		for(int i=0;i<cricket.length();i++) {
			if(cricket.charAt(i)=='A'||cricket.charAt(i)=='E'||cricket.charAt(i)=='I'||cricket.charAt(i)=='O'||
					cricket.charAt(i)=='i'||cricket.charAt(i)=='e'||cricket.charAt(i)=='a'||cricket.charAt(i)=='U'||
					cricket.charAt(i)=='o'||cricket.charAt(i)=='u') {
				splChar[i]='@';

			}
		
		}System.out.println(splChar);
		String squad ="India announced fifteen member squad for cricket world cup 2023";
		String splSquad=squad.replaceAll("[AEIOUaeiou]", "\\$");//for $ only we use \\$ otherwise #.% normal
		System.out.println(splSquad);

	}

}
