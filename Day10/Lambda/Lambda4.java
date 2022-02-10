package com.Day10;
import java.util.ArrayList;
public class Lambda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("mango");

		list.forEach((number)->System.out.println(number));
		
	}

}
