package com.bridgelabz.practice;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter number to find number is prime number or not");
		int number=utility.getIntValue();
		utility.checkPrimeNumber(number);

	}

}
