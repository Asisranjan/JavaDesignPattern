package com.example.designpattern.decorateobject.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try {
			InputStream is = new LowercaseFilterInputStream(
					new BufferedInputStream(new FileInputStream("test.txt")));
			
			while ( (c = is.read()) >= 0) {
				System.out.print((char)c);
			}
			
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
