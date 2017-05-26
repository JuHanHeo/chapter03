package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("hello2.txt");
			int count = 0;
			int data = -1;
			while((data = fr.read())!=-1){
				count++;
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("파일 없음" + e);
		} catch (IOException e){
			System.out.println("아이오 에러" + e);
		}

	}

}
