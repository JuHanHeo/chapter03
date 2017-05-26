package lang;

class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1 = new Point(10,20);
		Point pt2 = new Point(10,20);
		Point pt3 = pt2;
		
		//== 연사자에서 두 개의 항이 객체 참조 변수인 경우
		//두 객체의 동일 여부를 확인(동일성)
		System.out.println(pt1==pt2);
		System.out.println(pt2==pt3);
		
		
		//두 객체의 동질성 비교를 할 때에는 equals사용
		//equal가 오버라이드 되지 않은 경우 ==과 완전히 동일
		System.out.println(pt1.equals(pt2));
		System.out.println(pt2.equals(pt3));
		
		
		//String 객체 비교 equals, hashcode 메소드가 오버라이드 된 경우(내용을 비교할수 잇게 오버라이드 되어 잇음)
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = s2;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));	
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		

	}

}
