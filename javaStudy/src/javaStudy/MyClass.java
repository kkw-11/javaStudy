package javaStudy;

public class MyClass {
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public void method1() {
		System.out.println("Hello Method1");
	}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 method2 ");
	}
	
	
	public int method3() {
		System.out.println("Hello Method3");
		return 33;
	}
	
	public void method4(int a, int b) {
		System.out.println("method4");
		System.out.println("a:" + a + "  b: " + b);
		
	}
	
	
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println(mc.sum(1,2));
		mc.method4(1,2);
		
	}
	
	
	
	
	

}
