package com.shikhu.arraysquestions.easy;

public class EasyQuestionsPractice {

	
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


	public boolean findPairWithSum(int[] array , int sum) {
		
		for(int i=0;i<array.length;i++) {
			
			
			for(int j=i+1 ; j<array.length;j++) {
				
				
				if(array[i] + array[j] == sum) {
					
					
					return true;
				}
				
			}
	
		}
		
		
		return false;
	}

	
	public void printPairsWithSum(int [] array , int sum) {
		
		for(int i=0;i<array.length;i++) {
			
			
			for(int j=i+1; j<array.length;j++) {
				
				if(array[i] + array[j] == sum) {
					
					System.out.println("the pair is "+array[i]+","+array[j]);
					
				}
				
			}
			
		}
		
		
	}


    public boolean isContain(int [] array , int num) {
    	
    	for(int i=0 ; i<array.length;i++) {
    		
    		if(array[i] == num) {
    			
    			return true;
    			
    		}
    		
    	}
    	
    	
    	return false;
    }

    
    public boolean binarySearch(int [] array , int num) {
    
    	//input  array  is expected to be sorted
    	//1,2,3,4,5,6,7
    	
    	int low = 0;
    	int high = array.length-1;
    	int mid = (low+high)/2;
    	
		while (low <= high) {
			if (array[mid] == num) {
				return true;
			} else if (array[mid] > num) {
				high = mid - 1;
			} else if (array[mid] < num) {
				low = mid + 1;
			}
		}
    	return false;
    }

}
