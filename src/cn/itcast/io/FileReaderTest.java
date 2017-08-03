package cn.itcast.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 复习 同java程序 如何读取 a1.txt a2.txt a3.txt
 * 
 * @author seawind
 * 
 */
public class FileReaderTest {
	public static void main(String[] args) throws Exception {
		// String filename = "src/a1.txt";
		String filename = FileReaderTest.class.getResource("/a1.txt").getFile();
		readfile(filename);

		String filename2 = "WebRoot/a2.txt";
		readfile(filename2);

		String filename3 = "a3.txt";
		readfile(filename3);
	}

	private static void readfile(String filename) throws FileNotFoundException,
			IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
		in.close();
	}

}
