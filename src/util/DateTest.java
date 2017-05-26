package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		printDate(now);
		printDate2(now);

		//특정 시간 세팅 (2000/4/21)
		Date d2 = new Date(100,3,21);
		printDate2(d2);

		//특정 시간 세팅 (2000/4/21 13:25:30)
		Date d3 = new Date(100,3,21,13,25,30);
		printDate2(d2);




	}
	public static void printDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
	}

	public static void printDate2(Date date){
		int year = date.getYear();

		//년도 (+1900)
		System.out.println(year+1900 + "년");

		//월(0~11)
		System.out.println(date.getMonth()+1 + "월");

		//날짜
		System.out.println(date.getDate());

		//시간
		System.out.println(date.getHours() + "시 " + date.getMinutes() + "분 " + date.getSeconds() + "초 " );
	}

}
