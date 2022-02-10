package com.Day10;

@FunctionalInterface
interface Drawables{
	
	public void  draw();
	
}

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		//functional style
		Drawables d =() ->{
			
			System.out.println("draw"+width);
		};
		d.draw();
	}

}
