package javaStudy;

public class ConstantExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		num = 10;
		num = 5;
		
		
		// 상수 선언 명령어 final
		final int NUMBER;
		
		NUMBER = 10;
		
		
		final double PI = 3.14159;
		
		double circleArea = 3*3*PI;
		
		System.out.println(num);
		
		System.out.println(NUMBER);
		
		System.out.println(circleArea);
		
		final int OIL_PRICE = 1450;
		
		int totalPrice = 50 * OIL_PRICE;
		
		System.out.println(totalPrice);
		

	}

}
