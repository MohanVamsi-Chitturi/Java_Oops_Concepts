package com.practice;

import java.util.Scanner;

public class MatrixProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1,c1,r2,c2,i,j,k,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and coloumns of first matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the elements of First Matrix");
		int a[][] = new int[r1][c1];
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the rows and coloumns of second matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		System.out.println("Enter the elements of Second Matrix");
		int b[][] =  new int[r2][c2];
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[r1][c2];
		if(c1!=r2) {
			System.out.println("Matrix multiplication not Possible");
		}
		else {
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					for(k=0;k<r2;k++) {
						sum=sum+a[i][k]*b[k][j];
					}
					c[i][j]=sum;
					//sum=0;
				}
			}
			
			
			System.out.println("Product of the matrices:");
			 
	         for (i = 0; i < r1; i++)
	         {
	            for (j = 0; j < c2; j++)
	               System.out.print(c[i][j]+"\t");
	 
	            System.out.print("\n");
	         }
				
		}
	}

}
