package chap07.sec02.확인문제.Q2;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //자동 타입 변환
		
		snowTire.run();
		tire.run();
	}

}
