package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		//메소드를 호출하면 매개값은 클래스의 메소드에 먼저 접근
		System.out.println("현제 속도는: " + myCar.getSpeed());
		
		myCar.setSpeed(50);
		System.out.println("현제 속도는: " + myCar.getSpeed());
		
		//main 메소드 안에서 조건문 사용
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
	}

}
