package com.demo;
import java.util.*;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count=0;
		String text = s.nextLine();
		char c = s.next().charAt(0);
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i) == c) {
				count++;
			}
		}
		
		System.out.println("The character " + c + " occured " + count + " number of times.");

	}

}
