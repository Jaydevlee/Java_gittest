package chap07.sec01.Protected제한자.pack2;

import chap07.sec01.Protected제한자.pack1.A;

public class D extends A {
	//다른 패키지이나 상속관계이므로 A클래스에 접근 가능
		public D() {
			super();
			this.field = "value";
			this.method();
		}
}
