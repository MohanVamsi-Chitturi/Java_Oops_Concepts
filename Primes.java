package com.practice;

public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 2, high = 50;
        while (low < high) {
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
	}

}
