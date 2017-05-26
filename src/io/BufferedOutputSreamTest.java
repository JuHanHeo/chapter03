package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputSreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for(int i='1';i<'9';i++){
				try {
					bos.write(i);
					bos.flush(); //버퍼가 차지 않은 상태에서 플러시를 한다
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
