package chap08.sec01.다중인터페이스구현;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		//Smartelevision클래스가 RemoteControl, Searchable 클래스를 구현하고 있기 때문에 각 타입의 변수와 연결할 수 있다. 
		RemoteControl rc = tv;
		Searchable searchable = tv;

	}

}
