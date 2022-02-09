package proj3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedReader1 {

	public static void main(String[] args) {
		FileInputStream fin = new FileInputStream("abc.txt");

		BufferedInputStream readbin = new BufferedInputStream(fin);
		
		FileOutputStream out = new FileOutputStream("output_abx_sumalatha.txt");

		int i;

		while ((i = readbin.read()) != -1) {

			out.write(i);
			
	

		}

		fin.close();

		readbin.close();

	}

}
