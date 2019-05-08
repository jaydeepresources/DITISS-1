package chars;

import java.io.FileReader;
import java.io.IOException;

public class CharRead {

	public static void main(String[] args) throws IOException {

		FileReader fin = new FileReader("/Users/jaydeep/Desktop/Assignments.docx");
		int ch = 0;
		while ((ch = fin.read()) != -1) {
			System.out.print((char) ch);
		}

	}

}
