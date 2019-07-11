package com.practice;

	class A{		
		void mul(int p,int q) {
			System.out.println(p*q);
		}
		void add(int a,int b) {
			System.out.println(+a+b);
		}
		void mul(int p,int q,int r) {
			System.out.println(p*q*r);
		}
	}

	class B extends A{
		void add(int a,int b) {
			System.out.println("In child class "+a+b);
		}
	}

	public class OverloadVsOverride extends B {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			B b = new B();
		
			b.mul(1, 2);
			b.mul(1, 2, 3);
			b.add(1, 2);
		}
	}
