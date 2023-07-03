package com.first.julyproject;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
//		checkPalindrome(s);
//		System.out.println(checkPalindrome2(s));
		mergeNumbersAndString(s);
		
	}

	private static void mergeNumbersAndString(String s) {
		int sum=0;
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				sum=sum+ch-48;
			}else {
				res=res+ch;
			}
		}
		System.out.println(res+sum);
		
		
		
	}

	
	
	
	private static boolean checkPalindrome2(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}

	private static void checkPalindrome(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		if(res.equals(s)) {
			System.out.println("isPalindrome");
		}else {
			System.out.println("isNotPalindrome");
		}
	}
}
