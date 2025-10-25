package chap08.sec02.인터페이스다형성.매개변수;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		

	}

}
