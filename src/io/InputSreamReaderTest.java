package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputSreamReaderTest {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		
		try {
			isr = new InputStreamReader(new FileInputStream("MS949.txt"), "MS949");
			int data = -1;
			while((data = isr.read())!=-1){
				System.out.println((char)data);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
