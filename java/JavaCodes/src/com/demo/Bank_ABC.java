package com.demo;

import java.io.*;

 class Bank_ABC  {
	

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("P:\\vcd.txt"));
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			
				br.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
