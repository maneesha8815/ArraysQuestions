package com.shikhu.arraysquestions.easy;

public class Testing {

	public static void main(String[] args) {
		
		RecursionExample example = new RecursionExample();
		System.out.println(example.fact(5));
		
		System.out.println(example.sumOfNum(10));
			
	}

	private static void testingArrayQuestions() {
       
		EasyQuestionsPractice practice = new EasyQuestionsPractice();  //object
		
		int[] array = {1,2,3,4}; //
		
		int sum = 7;
	
		 boolean result = practice.findPairWithSum(array, sum);
		
	    System.out.println(result);
		
		practice.printPairsWithSum(array, sum);
		
		result = practice.binarySearch(array, 2);
		
		int num = 1;
		
		result = practice.isContain(array, num);
		
		System.out.println(result);
		
	}
	
}
