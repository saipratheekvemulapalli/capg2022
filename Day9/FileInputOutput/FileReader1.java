package proj3;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		FileReader ioreader = new FileReader("abc.txt");
		//mention the source for reading
		
		int i;

		while ((i = ioreader.read()) != -1) {

			System.out.println((char) i);

}

				ioreader.close();

	}

}
