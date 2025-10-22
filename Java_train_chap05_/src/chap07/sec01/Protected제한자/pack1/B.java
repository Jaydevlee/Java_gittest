package chap07.sec01.Protected제한자.pack1;

public class B {
	//접근제한자 public, 리턴이 없는 메소드
	public void method() {
	//A생성자 호출
	A a = new A();
	A a2 = new A("hi");
	
	//A의 필드값 지정
	a.field = "value";
	a2.field1 = "hello";
	
	//A의 메소드 호출
	a.method();
	a2.method2();
	}
}
