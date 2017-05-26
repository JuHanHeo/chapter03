package lang;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point pt = new Point();

		System.out.println(pt.getClass().getName());
		System.out.println(pt.hashCode());
		//getClass().getName()+"@"+hasCode()
		System.out.println(pt.toString());
		System.out.println(pt);

		/* cf String 객체와 비교 */

		String s = new String("hello");	
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		//getClass().getName()+"@"+hasCode()
		System.out.println(s.toString());
		System.out.println(s);
		}

}
