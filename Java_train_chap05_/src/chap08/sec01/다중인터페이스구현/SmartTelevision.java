package chap08.sec01.다중인터페이스구현;
//              구현클래스         구현        인터페이스1      인터페이스2
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	//생성자
	
	//메소드
	//RemoteControl 메소드 구현
	//turnOn의 메소드 구현
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff 메소드 구현
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolume구현
	public void setVolume(int volume) {
		if(volume >= MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume <= MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨: " + volume);
	}
	//Searchable 메소드 구현
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
