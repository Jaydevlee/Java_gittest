package chap08.sec01.인터페이스사용;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)-------------");
		//기본 생성자 호출
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		//생성자 호출
		System.out.println("2)-------------");
		MyClass myClass2 = new MyClass(new Audio());
		
		//methodA호출
		System.out.println("3)-------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		//methodB호출
		System.out.println("4)-------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
