package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9}; //intA라는 방을 3개 만들었다. new 생략된 것.
		
		int[] intB; //B라는 룸을 만들어 주었다.
		intB = intA; //B룸은 A와 같다.
		intB[0] = 20; //A는 0부터 룸이 시작하는데, 0번 룸의 값 3을 20으로 바꿈.
		intB[2] = 10; //A의 2룸이 시작하는데, 2번 룸의 값 9을 10으로 바꿈.
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]); //B를 출력해도 같은 값이 나온다. 같으니까.
		}
		

	}

}
