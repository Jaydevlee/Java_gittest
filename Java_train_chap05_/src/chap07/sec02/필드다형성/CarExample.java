package chap07.sec02.필드다형성;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼을 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼", 80);
				break;
			case 2:
				System.out.println("앞오를 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오", 90);
				break;
			case 3:
				System.out.println("뒤왼을 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼", 70);
				break;
			case 4:
				System.out.println("뒤오를 HankookTire로 교체");
				car.backRightTire = new HankookTire("뒤오", 50);
				break;
			}
			System.out.println("-------------------");
		}
	}

}
