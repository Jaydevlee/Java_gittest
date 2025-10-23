package chap07.sec02.매개변수다향성;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); //DrvierExample-Driver: 집합관계
		Bus bus = new Bus(); //DrvierExample-Bus: 집합관계
		Taxi taxi = new Taxi(); //DrvierExample-Texi: 집합관계
		
		driver.drive(bus); //Vehicle vehicle = bus
		driver.drive(taxi); //Vehicle vehicle = taxi
		//매개 변수의 다형성
		
	}

}
