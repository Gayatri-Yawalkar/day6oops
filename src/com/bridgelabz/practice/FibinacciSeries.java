package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;
public class FibinacciSeries {
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter number of values to display in series");
		int numCount=utility.getIntValue();
		utility.getFibonacciSeries(numCount);		
	}
}
