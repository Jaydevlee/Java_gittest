package chap06.chap6_3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("검정", 300);
		//기본 생성자를 호출할 수 없다.
		System.out.println(myCar.color);
		System.out.println(myCar.cc);
	}

}
