package com.shikhu.arraysquestions.easy;

public class LargestSmallestNumber {

	
	public int findLargestNumber(int [] array) {
		
		int largest=0;
		
		
		for (int i = 0; i < array.length; i++) {

			if (array[i] > largest) {
				largest = array[i];
			}
		}
		
		return largest;
	}
	
	
	public int findSmallestNumber(int [] array) {
		int smallest = array[0];

		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < smallest) {
				smallest = array[i];
			}
			
		}
		return smallest;

	}
}
