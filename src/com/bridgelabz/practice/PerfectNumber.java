package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class PerfectNumber {
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Number to find it is Perfect Number or not");
		int number=utility.getIntValue();
		utility.checkPerfectNumberOrNot(number);
	}
}
