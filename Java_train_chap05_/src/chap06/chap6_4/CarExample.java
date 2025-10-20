package chap06.chap6_4;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); // setGas 메서드 호출
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); //Car의 run메소드 호출
		}
		
		if(myCar.isLeftGas()) { //Car의 isLeftGas메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}
