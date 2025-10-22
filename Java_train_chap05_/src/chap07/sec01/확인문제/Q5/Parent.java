package chap07.sec01.확인문제.Q5;

public class Parent {
	public String nation;
	
	//생성자
	public Parent() {
		this("대한민국");
		System.out.println("Parent() Call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) Call");
	}
}
