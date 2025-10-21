package sec06.exam06;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	//private로 외부의 접근 제한
	
	//생성자(생성자를 따로 선언하지 않으면 기본 생성자)
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	//boolean은 get-> is boolean기본값은 false다
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
}
