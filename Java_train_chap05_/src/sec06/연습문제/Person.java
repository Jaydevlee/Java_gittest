package sec06.연습문제;

public class Person {
	//필드 private(접근제한자)
	private	String name;
	private int age;
	
	
	//생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.equals("")) {
			this.name = name;
		} else {
			this.name = "이름없음"; //이름이 빈문자열일 경우 
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0) {
		this.age = age;
		}
	}
	void printInfo() { 
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
	}

	
}
