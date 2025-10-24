package chap07.sec03.추상클래스선언;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 추상클래스임으로 new키워드 사용 x
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
