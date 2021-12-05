package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3]; //룸의 개수와 i범위가 일치하지 않음
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
	
		int result = 0;
		
		for ( int i =0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
		
	}

}
