package chap07.sec01.확인문제.Q5;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() Call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) Call");
	}
	
}
