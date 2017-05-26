package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		File file = new File("Phone.txt");
		if(file.exists() == false){
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		System.out.println("==========파일정보==========");
		System.out.println("경로:"+file.getAbsolutePath());
		System.out.println("크기:"+file.length() + "Bytes");
		Date d = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:dd");
		System.out.println("마지막 수정:"+sdf.format(d));

		System.out.println("==========전화번호==========");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		br = new BufferedReader(isr);

		String line;
		int index=0;
		while((line = br.readLine())!=null){
			StringTokenizer st = new StringTokenizer(line, "	 ");
			while(st.hasMoreTokens()){
				String s = st.nextToken();
				if(index ==0){
					System.out.print(s+" ");
					index ++;
				}else if(index ==1){
					System.out.print(s+" ");
					index ++;
				}else if(index ==2){
					System.out.print(s+" ");
					index ++;
				}else if(index ==3){
					System.out.println(s+" ");
					index = 0;
				}
				
			}
		}

	}

}
