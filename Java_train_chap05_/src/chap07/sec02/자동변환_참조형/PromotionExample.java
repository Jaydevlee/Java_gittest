package chap07.sec02.자동변환_참조형;

	class A{}
	
	class B extends A{}
	class C extends A{}
	
	class D extends B{}
	class E extends C{}
	
	public class PromotionExample{
		public static void main(String [] args) {
			B b = new B();
			C c = new C();
			D d = new D();
			E e = new E();
			
			A a1 = b;
			A a2 = c;
			A a3 = d; //D클래스가 A클래스를 부모로하는 B클래스를 상속 받아서 가능
			A a4 = e; //E클래스가 A클래스를 부모로하는 C클래스를 상속 받아서 가능
			
			
			B b1 = d;
			C c1 = e;
			
			B b3 = e;
			C c2 = d;
		}

}
