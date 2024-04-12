package com.sunbeam;

import java.util.Scanner;

public class ReverseString {
	
	
	public static void main(String[] args) {
		StringBuilder s1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		s1 = new StringBuilder(sc.nextLine());
		
		System.out.println("Original String - "+s1);
		
		StringBuilder s2 = s1.reverse();
		System.out.println("Reversed string - "+s2);
		
	}

}
