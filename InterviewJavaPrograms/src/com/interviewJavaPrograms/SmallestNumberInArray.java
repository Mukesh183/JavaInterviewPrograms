package com.interviewJavaPrograms;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {
	
	Integer givenArray[]= {43,22,5,55,3};
	
	public void findSmallest() {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<givenArray.length;i++) {
			if(smallest>givenArray[i]) {
				smallest=givenArray[i];
			}
		}
		System.out.println("Smallest value in Array: "+smallest);
	}
	
	public void usingArrays() {
		Arrays.sort(givenArray);
		System.out.println("Smallest value in Array using Arrays: "+givenArray[0]);
	}
	
	public void usingCollection() {
		List<Integer> list = Arrays.asList(givenArray);
		Collections.sort(list);
		int smallest = list.get(0);
		System.out.println("Smallest value in Array using collection: "+smallest);
		
	}
	
	public static void main(String[] args) {
		SmallestNumberInArray smallArray=new SmallestNumberInArray();
		smallArray.findSmallest();
		smallArray.usingArrays();
		smallArray.usingCollection();
	}

}
