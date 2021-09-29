package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Number to find Reverse of Number");
		int number=utility.getIntValue();
		int reverse=utility.getReverseNumber(number);
		System.out.println("Reverse Number of "+number+" is "+reverse);

	}

}
