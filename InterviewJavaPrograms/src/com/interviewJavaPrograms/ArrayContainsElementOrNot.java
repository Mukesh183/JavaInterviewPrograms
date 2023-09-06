package com.interviewJavaPrograms;

public class ArrayContainsElementOrNot {

	int arrayElements[]= {1,2,3,7,2,22,5,18,76};
	int sourceNumber=3;
	boolean valueGot=false;
	public void elementOrNot() {
		for(int i=0;i<=arrayElements.length-1;i++) {
			if(arrayElements[i]==sourceNumber) {
				valueGot=true;
				break;
			}
		}
		if(valueGot) {
			System.out.println("source number found");
		}
		else {
			System.out.println("source number not found");
		}
	}			

	public static void main(String[] args) {
		ArrayContainsElementOrNot containsElementOrNot= new ArrayContainsElementOrNot();
		containsElementOrNot.elementOrNot();
	}

}
