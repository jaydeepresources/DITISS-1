package chars;

import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("/Users/jaydeep/Desktop/New.doc");

		String data = "We have a test soon, so please start studying";

		fw.write(data);

	}

}
