package com.interviewJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {
	
	public void usingStringBuffer() {
		String name= "Mukesh";
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println(buffer.reverse());
		
	}
	
	public void usingOwnLogic() {
		String name = "Mukesh";
		char[] charcterName = name.toCharArray();
		String reverseName="";
		for(int i=charcterName.length-1;i>=0;i--) {
			reverseName=reverseName+charcterName[i];
		}
		System.out.println(reverseName);
	}
	
	public void usingCollections() {
		String name= "Mukesh";
		char[] charcterName = name.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (Character character : charcterName) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator<Character>reverseName = list.listIterator();
		while(reverseName.hasNext()) {
			System.out.println(reverseName.next());
		}
	}

	public static void main(String[] args) {
		ReverseAString aString = new ReverseAString();
		//aString.usingStringBuffer();
		//aString.usingOwnLogic();
		aString.usingCollections();

	}

}
