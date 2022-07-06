package javaStudy;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		
		
		System.out.println(localScope);
		System.out.println(value);
		
		// 전역 변수 테스트
		System.out.println(globalScope);
		
		
		
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value1);
		
		System.out.println(value2);

	}
	

	public static void main(String[] args) {
//		globalScope = 11;
		staticVal = 11;
		// TODO Auto-generated method stub
//		scopeTest(3);
		VariableScopeExam vs = new VariableScopeExam();
		System.out.println(VariableScopeExam.staticVal);
		System.out.println("vs.globalScope: "+ vs.globalScope);
//		System.out.println(localScope);
//		System.out.println(value1);
		
//		System.out.println(value2);
		
//		System.out.println(staticVal);
		
		
		VariableScopeExam v1 = new VariableScopeExam();
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println("v1.globalScope: " + v1.globalScope);
		System.out.println("v2.globalScope: " + v2.globalScope);
		
		v1.staticVal = 50;
		v2.staticVal = 100;
		
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		
		
	}

}
