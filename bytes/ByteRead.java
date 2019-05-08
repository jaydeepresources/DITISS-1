package bytes;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteRead {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("/Users/jaydeep/Desktop/Assignments.docx");
		int ch = 0;
		while ((ch = fin.read()) != -1) {
			System.out.print((char)ch);
		}

	}

}
