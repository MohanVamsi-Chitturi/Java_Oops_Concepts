package com.practice;

import java.util.Scanner;

	class Student{
		int rollNo=1;
		int s1=90,s2=89,s3=75,s4=70,s5=80;
	}
	class Test extends Student{
		int total = s1+s2+s3+s4+s5;
		int average = total/5;
	}
	class Result extends Test{
		void display() {
			System.out.println("Total is "+total+" Average is "+average);
		}
	}
	
public class MultiLevelInheritance extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result s = new Result();
		s.display();
	}

}
