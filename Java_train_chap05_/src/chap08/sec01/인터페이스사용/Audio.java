package chap08.sec01.인터페이스사용;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	//생성자
	
	//추상 메소드 구현
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	//turnOff 메소드 구현
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	//setVolume 구현
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
