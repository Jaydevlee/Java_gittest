package chap09.sec01.중첩클래스;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//인트너스 멤버 클래스 호출(객체 생성)
		A.B b = a.new B(); //A클래스에 있는 B클래스의 객체를 생성해서 b에 메모리 번지를 저장해라
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 호출
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		

	}

}
