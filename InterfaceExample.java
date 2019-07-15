package com.practice;

import java.util.Scanner;

interface In1
	{
		void display(int p);
	}

	class TestClass implements In1{
		int j,i;
		public void display(int p) {
			System.out.println(primes(p));

		}
		int primes(int p) {
			int low = 2;
	        while (low < p) {
	            boolean flag = false;
	            for(int i = 2; i <= low/2; ++i) {
	                if(low % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }
	            if (!flag)
	                System.out.print(low + " ");
	            ++low;
	        }
			return low;
		}
		
	}
	
public class InterfaceExample extends TestClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample s = new InterfaceExample();
		
		/*Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the last number ");
		int end=sc.nextInt();
		s.display(end)*/
		
		s.display(50);
	}

}
