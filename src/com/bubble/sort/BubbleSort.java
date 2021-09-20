package com.bubble.sort;

import java.util.Iterator;

public class BubbleSort {
	
	public int[] bubbleSort(int[] nums) {
		
		
		for(int i =nums.length-1; i > 0; i--) {
			int j = i-1;
			
			if(nums[j] > nums[i]) 
			{
				int tmp = nums[j];
				nums[j] = nums[i];
				nums[i] = tmp;
			}
			
			
		}
		
		return nums;
		
	}
	
	public int[] bubbleSort2(int[] nums) {
		
		int n = nums.length-1;
		for(int i=0; i< n; i++) {
			for(int j =0; j< n-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
		
		return nums;
	}
	
	public int[] bubbleSort3(int [] nums) {
		
		int n = nums.length-1;
		for(int i=n; i>0; i--) {
			for(int j=n; j>0; j--) {
				if(nums[j] < nums[j-1]) {
					int tmp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = tmp;
				}
			}
		}
		
		
		return nums;
	}
	
}
