package chap07.sec01.Protected제한자.pack2;

import chap07.sec01.Protected제한자.pack1.A;

public class C {
	//다른 패키지, 상속관계x 접근x
	public void method() {
		A a = new A();
		A a2 = new A("hi");
		
		a.field = "value";
		a2.field1 = "hello";
		
		a.method();
		a2.method2();
	}
}
