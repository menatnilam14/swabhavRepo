package com.techlabs.write.file.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		String fileContent = "hello";

		FileWriter fileWriter = new FileWriter(
				"C:/swabhavRepository/OOP1/OOPS/write-file-app/src/com/techlabs/write/file/test/ReadMe.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print(fileContent);
		printWriter.println();
		printWriter.println("My name is Nilam Menat");
		printWriter.close();

	}

}
