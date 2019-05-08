package crypto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestEncrypt {

	static void encrypt() throws IOException {
		FileInputStream fin = new FileInputStream("/Users/jaydeep/Desktop/Assignments.docx");
		FileOutputStream fos = new FileOutputStream("/Users/jaydeep/Desktop/Assignments_Enc.docx");

		int ch = 0;

		while ((ch = fin.read()) != -1) {
			ch++;
			fos.write(ch);
		}

		fos.close();
	}

	static void decrypt() throws IOException {

		FileInputStream fin = new FileInputStream("/Users/jaydeep/Desktop/Assignments_Enc.docx");
		FileOutputStream fos = new FileOutputStream("/Users/jaydeep/Desktop/Assignments_Dec.docx");

		int ch = 0;

		while ((ch = fin.read()) != -1) {
			ch--;
			fos.write(ch);
		}

		fos.close();
	}

	public static void main(String[] args) throws IOException {

		encrypt();
		decrypt();
		
	}

}
