package com.shikhu.arraysquestions.easy;

public class RecursionExample {

	public int fact(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}
	
	
	public int sumOfNum(int n) {
		
		if(n==1) {
			
			return 1;
		}
		return n+sumOfNum(n-1);
		
	}
	
}
