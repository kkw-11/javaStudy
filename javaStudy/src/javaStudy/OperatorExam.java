package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1 = -5;
		int i2 = +i1;
		int i3 = -5;
		int i4 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		int i5 = ++i4; // i3 = i3+1; // 증가 후 대입
		System.out.println(i5);
		System.out.println(i4);
		
		int i6 = i4++; // 대입후 증가
		System.out.println(i4);
		System.out.println(i6);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j); // (정수 / 정수) = 정수
		System.out.println(i / (double)j); // (정수 / 실수) = 실수
		System.out.println(i % j);
		
		
		
		
	}

}
