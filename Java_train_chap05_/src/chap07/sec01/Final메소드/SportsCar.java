package chap07.sec01.Final메소드;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public final void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
