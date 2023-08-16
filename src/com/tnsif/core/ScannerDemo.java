package com.tnsif.core;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Numbers for multiplication:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int product=a*b;
		System.out.println(product);

	}

}
