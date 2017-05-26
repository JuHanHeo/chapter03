package lang;

public class RectTest {
	public static void main(String[] args) {
		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);
		
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(System.identityHashCode(r1));
		System.out.println(System.identityHashCode(r2));
		
		
		//jvm 안의 리터럴(상수) 풀(pool)에서 객체 생성 관리를 하기 때문에 문자열 해싱값이 같은 문자열 객체는 2개 이상 만들지 않는다.
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str2;
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		str2 = str2+"abc";
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2);
	}

}
