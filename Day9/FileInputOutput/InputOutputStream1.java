package proj3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputOutputStream1 {

	public static void main(String[] args) {
		InputStream in = new FileInputStream("abc.txt");

		FileOutputStream out = new FileOutputStream("output_abx_rohit.txt");

		int i;

		while ((i = in.read()) != -1) {

			out.write(i);

		}

		in.close();

		System.out.println("done..");

	}

}
