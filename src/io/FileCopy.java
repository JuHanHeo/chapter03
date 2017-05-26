package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		FileInputStream fis = null ;
		FileOutputStream fos = null ;
		// TODO Auto-generated method stub
		try {
			fis = new FileInputStream("./jee.png");
			fos = new FileOutputStream("./jee2.png");
			
			int data= -1;
			while((data = fis.read())!=-1){
				fos.write(data);
			}
			

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음 : "+e);
		} catch (IOException e){
			System.out.println("아이오 오류 : "+e);
		} finally {
			
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("아이오 오류 : "+e);

			}
			
		}		

	}

}
