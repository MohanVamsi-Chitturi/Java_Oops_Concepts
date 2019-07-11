package com.practice;

public class ChildB extends ParentA {
	
	void mul(int p,int q)
    {
        System.out.println(p*q);
    }
	void task(int a,int b) {
		System.out.println((a*a)+(b*b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildB ch=new ChildB();
		ch.task(3, 4);
		ch.add(1, 2);
		ch.mul(1, 2);
	}
}
