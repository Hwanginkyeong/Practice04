package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] num = new double[] {1.2, 3.3, 6.7}; //3개의 룸을 만들고 값을 넣음
		
		for(int i = 0; i<num.length; i++ ) {
			if(i==0) {
				System.out.println(num[2]);
			}else if(i==1) {
				System.out.println(num[1]);	
			}else if(i==2) {
				System.out.println(num[0]);	
			}
		}
		
		
		
		
		

	}

}
