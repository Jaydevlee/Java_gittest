package chap06.chap6_1;

public class Student {
	String name; //변수x 필드 메소드 밖에서 선언됨
	
	Student(){} //생성자 식별방법: 클래스 이름과 동일하며 메소드 형식(리턴타입이 없는 메소드)
	
	void study () {
		String str = "학생은 공부를 합니다."; //변수, 메소드 안에서 선언됨
		System.out.println();
	} //java에서 void키워드를 가지는 경우는 메소드 일 때, void: 리턴타입
}	//변수와 메소드 구분; 구문의 끝을 보자
