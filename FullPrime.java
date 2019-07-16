package com.practice;

import java.util.Scanner;

public class FullPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		if(isPrime(num) && isDigitPrime(num)) {
			System.out.println(num+" is a Full prime number");
		}
		else {
			System.out.println(num+" is Not a Full Prime Number");
		}
		
	}

	private static boolean isDigitPrime(int num) {
		// TODO Auto-generated method stub
		while (num > 0) { 
            		int num1 = num % 10; 
            		if (num1 != 2 && num1 != 3 && num1 != 5 && num1 != 7) 
               			 return false; 
  
            		num /= 10; 
        	}
        return true; 
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<2)
			return false;
		for (int i = 2; i < num; i++) {
            if (num % i == 0) 
                return false;       	
		}
		return true;
	}
}
