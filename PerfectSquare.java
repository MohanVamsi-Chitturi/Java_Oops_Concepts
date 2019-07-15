package com.practice;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(Math.sqrt(num) == Math.floor(Math.sqrt(num)))
			System.out.println("1");
		else
			System.out.println("0");
	}

}
