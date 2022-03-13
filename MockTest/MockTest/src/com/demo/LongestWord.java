package com.demo;
import java.util.*;

public class LongestWord {
	public static String LongestWord(String sen) {
		
		String newSen = sen.replaceAll("[^a-zA-Z0-9]"," ");
		return Arrays.stream(newSen.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String result = LongestWord.LongestWord(s.nextLine());
		
		System.out.println(result);
		
		s.close();
	}

}
