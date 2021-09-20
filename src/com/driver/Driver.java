package com.driver;

import com.bubble.sort.BubbleSort;

public class Driver {
	public static void main(String[] args) {
		
		int [] nums = {3,4,1,7,5,9,8};
		
		BubbleSort call = new BubbleSort();
		
		call.bubbleSort3(nums);
		
		for(int i:nums)
			System.out.println(i);
	}

}
