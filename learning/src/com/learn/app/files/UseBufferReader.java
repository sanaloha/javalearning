package com.learn.app.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class UseBufferReader {

	public static void main(String[] args) {
		
		writeToFile();
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\santo\\projects\\Java\\javalearning\\file.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
			System.out.println(line);
			}
			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	

	public static void writeToFile() {
		
		String content = "writing to an existing file";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\santo\\projects\\Java\\javalearning\\file.txt"))) {
			bw.write(content); //this will remove contents from existing file and overwrite its contents
			bw.newLine();
			bw.write("writing to the next line");
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}


//BufferedReader extends Reader -this is an abstract class
//Reader implements Readable, Closeable
//FileReader extends InputStreamReader
// InputStreamReader extends Reader
/**
 * FileReader takes argument of File class and returns object of FileInputStream
 * FileInputStream extends InputStream 
 * InputStream implements Closeable
 * 
 * 
 * **/

//


