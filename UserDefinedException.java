package com.StringsPractice;

import java.util.Scanner;
class EvenNumberException extends Exception {

}
public class UserDefinedException {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		try {
			if(num%2!=0)
				throw(new EvenNumberException());
			else
				System.out.println("You entered an Even Number");
		}
		catch(EvenNumberException e) {
			System.out.println("Even Number Exception Please enter an even number");
		}
		finally {
			System.out.println("Exception Closed");
		}
	}

}
