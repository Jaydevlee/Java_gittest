package chap08.sec02.인터페이스다형성;

public class KumhoTire implements Tire{
	//메소득 구현
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}
