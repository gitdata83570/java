package com.sunbeam;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		
		s1 = sc.nextLine();
		StringBuilder s2 = new StringBuilder(s1);
		s2.reverse();
		
				
		if(s1.equals(s2.toString()))
			System.out.println("String is palindrome ");
		else
			System.out.println("String is not palindrome");
		
		
		
		
		

	}

}
