package chap08.sec01.상수_추상메소드_구현;

public interface RemoteControl {
	//상수
	//final static - 생략할 수 있다. interface는 필드를 상수로 인식함
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	//abstract - 생략할 수 있다. interface는 메소드를 추상 메소드로 인식함
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
