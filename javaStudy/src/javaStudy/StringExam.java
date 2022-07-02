package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello"; // 상수 영역에 저장됨 hello가 하나만 만들어짐 str1과 str2 모두 하나의 상수 "hello"를 가리킴
		
		// new 연산자로 만들면 새로 heap 영역에 객체를 새로 만듬
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		}
		
	}

}
