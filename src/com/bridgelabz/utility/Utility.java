package com.bridgelabz.utility;

import java.util.Scanner;
public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}
//Fibonacci Series
	public void getFibonacciSeries(int count) {
		int firstNum=0,secondNum=1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i=2;i<count;i++) {
			int thirdNum=firstNum+secondNum;
			System.out.println(thirdNum);
			firstNum=secondNum;
			secondNum=thirdNum;
		}
	}
//Perfect Number
	public void checkPerfectNumberOrNot(int num) {
		int sum=0;
		for(int i=1;i<=(num/2);i++) {
			if(num%i==0)
			{
				sum=sum+i;				
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is Perfect Number");
		} else {
			System.out.println(num+" is not perfect Number");
		}
	}
	public void checkPrimeNumber(int num) {
		int flag=0;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is Prime Number");
		} else {
			System.out.println("Number is not Prime Number");
		}
	}
//Reverse of given Number
	public int getReverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
}
