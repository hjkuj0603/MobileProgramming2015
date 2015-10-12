package kr.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import kr.ac.kookmin.exception.fileio.AddLineNumber;

public class Trade {
	public void close(BufferedReader inputStream) {
		try {
			inputStream.close();

		} catch (IOException e) {
			System.err.print("IOException: " + e.getMessage());
		}
	}

	public void readFile() {

		try {
			BufferedReader inputStream = null;
			String path = Trade.class.getResource("").getPath();
			System.out.println(path);
			inputStream = new BufferedReader(new FileReader(path + "a.text"));
			try {
				String line = null;
				while ((line = inputStream.readLine()) != null) {
					System.out.println(line);

				}
			} finally {
				close(inputStream);
			}
		} catch (FileNotFoundException e) {
			System.err.print("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.err.print("IOException: " + e.getMessage());
		}

	}
}
