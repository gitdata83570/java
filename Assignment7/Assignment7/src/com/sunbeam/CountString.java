package com.sunbeam;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		int choice = 0;
		
		String s = s1.trim();
		System.out.println(s);
		
		String []arr = s.split(" ");
		
		for(String element : arr) {
			System.out.println( element);
		 	choice++;
		}
		
		System.out.println("Number of words - " + choice);
		

	}

}
