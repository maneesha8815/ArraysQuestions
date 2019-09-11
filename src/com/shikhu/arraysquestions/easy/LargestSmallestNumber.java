package com.shikhu.arraysquestions.easy;

public class LargestSmallestNumber {

	
	public int getLargestNumber(int [] array) {
		
		int largest=0;
		
		
		for(int i =0; i<array.length;i++) {
		
			if(array[i]>largest) {
				
				largest = array[i];
				
			}
			
			
		}
		
		return largest;
	}
	
	
	
}
