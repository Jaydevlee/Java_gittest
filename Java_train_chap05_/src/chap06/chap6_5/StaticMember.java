package chap06.chap6_5;

public class StaticMember {
	//인스턴스 필드
	int field1;
	//인스턴스 메소드
	void method1() {}
	
	//정적 필드
	static int field2;
	//정적 메소드
	static void method2() {}
	//정적 메소드
	static void method3() {
		field1 = 10; 	//인스턴스 필드
		method1();	//인스턴스 메소드 호출
		field2 = 10;	//정적 필드
		method2();	//정적 메소드 호출
	}
	//인스턴스 메소드
	void method4() {
		int field1; //인스턴스 필드
		method1();	//인스턴스 메소드 호출
		int field2; //정적 필드
		method2();	//정적 메소드 호출
	}
	}
}
