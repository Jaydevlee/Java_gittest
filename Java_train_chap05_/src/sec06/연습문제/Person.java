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
		if(name != null && !name.trim().isEmpty()) {
		this.name = name;
		} else {
			this.name = "이름없음";
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0) {
		this.age = age;
		} else {
			System.out.println("나이를 정확하게 입력하십시오");
		}
	}
	void printInfo() {
		setName(name);
		setAge(age);
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
	}

	
}
