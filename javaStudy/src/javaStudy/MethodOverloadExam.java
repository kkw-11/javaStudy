package javaStudy;

/**
 * @author asus
 *
 */
public class MethodOverloadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass2 mc = new MyClass2();
		
		System.out.println(mc.plus(1,2));
		System.out.println(mc.plus(1,2,3));
		System.out.println(mc.plus("Hello ","World"));
		
	}

}
