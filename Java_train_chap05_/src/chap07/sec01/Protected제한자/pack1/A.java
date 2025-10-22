package chap07.sec01.Protected제한자.pack1;

public class A {
	//접근제한자가 protected인 필드
	protected String field;
	//접근제한자 default
	String field1;
	
	
	//접근제한자가 protected인 생성자
	protected A() {
	}
	//접근제한자 default
	A(String field1) {
	}
	
	//접근제한자가 protected인 메소드
	protected void method() {
	}
	//접근제한자 default
	void method2() {
	}
}
