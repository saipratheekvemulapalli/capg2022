package com.Day10;

@FunctionalInterface
interface Sayable{
	
	public String  say();
	
}

public class Lambda2 {

	public static void main(String[] args) {
		//functional style
				Sayable s =() ->{
					return "hi how are you"; 
				};
				System.out.println(s.say());

	}

}
