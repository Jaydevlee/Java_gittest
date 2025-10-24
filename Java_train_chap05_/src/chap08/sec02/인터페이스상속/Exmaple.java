package chap08.sec02.인터페이스상속;

public class Exmaple {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		InterfaceB ib1 = (InterfaceB)ia;
		ib1.methodB();
		//ia.methodB(); methodB는 InterfaceB에 선언되었기 때문에 InterfaceA로 형변환되면 호출 x
		System.out.println();
		
		InterfaceB ib = impl;
		//ib.methodA(); methoA는 InterfaceA에 선언되었기 때문에 InterfaceB로 형변환되면 호출 x
		ib.methodB();
		InterfaceC ic1 = (InterfaceC)ib;
		ic1.methodC();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		//InterfaceC는 InterfaceA와 B를 상속받은 interface이기 때문에 상위 인터페이스의 메소드를 호출 할 수 있다.
	}

}
