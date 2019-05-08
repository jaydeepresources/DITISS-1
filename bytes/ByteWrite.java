package bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/Users/jaydeep/Desktop/New.doc");

		String data = "We have a test soon, so please start studying";

		fos.write(data.getBytes());
		fos.close();
	}

}
