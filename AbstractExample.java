package com.practice;

	abstract class Abstract1 {
		
	    int prod;
	    abstract void m1(int p,int q);
	    
	    void m2(){
	        System.out.println(prod);
	    }

	}
	
	class Abstract2 extends Abstract1{
		void m1(int p,int q) {
			System.out.println("Implemented Abstract method "+(p+q));
		}
	}
	
	public class AbstractExample{
		
		public static void main(String[] args) {
			Abstract2 ab = new Abstract2();
			ab.m1(2, 3);
			ab.m2();
		}
	}
	
