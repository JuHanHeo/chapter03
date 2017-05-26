package lang;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isDigit('2'));
		
		String s = "123a4";
		
		if(s.matches("-?\\d+(\\.\\d+)?")==false){//숫자 정규형 표현식
			System.out.println("숫자가 아닙니다");
		}else{
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		/*
		try {
			int i = Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자가 아닙니다");
		} 프로그램 로직으로 검증 하지 말것 */
		
		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("123456789"));
		
		System.out.println(String.valueOf(12345));

	}

}
