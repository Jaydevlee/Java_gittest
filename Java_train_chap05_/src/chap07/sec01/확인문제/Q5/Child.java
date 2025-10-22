package chap07.sec01.확인문제.Q5;

public class Child extends Parent{
	private String name;
	
	//생성자
	public Child() {
		//super(){}가 자동으로 추가됨
		this("홍길동");//public Child(String name)를 실행 why? name을 저장해야 할 곳이 필요함
		System.out.println("Child() Call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) Call");
	}
	
}
