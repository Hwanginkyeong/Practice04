package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[6]; //룸의 개수와 i범위가 일치하지 않음
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
		
		
		int result = 0;
		
		for ( int i =0; i<=5; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
		
	}

}
