package chap08.sec01.상수_추상메소드_구현;

public class Televison implements RemoteControl{
	//필드
	private int volume;
	
	
	//추상 메소드 구현
	
	//turnOn의 메소드 구현
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff 메소드 구현
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setvolume 메소드 구현
	public void setVolume(int volume) {
		if(volume >= MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume <= MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}
	/* 인터페이스의 추상메소드는 기본적으로 public 접근 제한을 가지기 때문에
	 * public을 생략할 수 없다.
	 * */
}
