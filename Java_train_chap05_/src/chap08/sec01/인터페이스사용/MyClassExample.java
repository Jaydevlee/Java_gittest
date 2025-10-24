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
		myClass1.methodA();
		
		//methodB호출
		System.out.println("4)-------------");
		myClass1.methodB(new Television());
	}
}
