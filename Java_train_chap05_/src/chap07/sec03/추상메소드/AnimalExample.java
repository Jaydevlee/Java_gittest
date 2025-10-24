package chap07.sec03.추상메소드;

public class AnimalExample {

	public static void main(String[] args) {
		//dog가 Dog클래스 참조
		Dog dog = new Dog();
		//cat이 Cat클래스 참조
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		//자동 타입 변환
		//Animal타입의 변수 animal이 아무것도 참조하지 않음
		Animal animal = null;
		//Dog클래스를 Animal타입의 변수 animal에 대입하기 위해 자동 타입변환
		animal = new Dog();
		animal.sound();
		
		//Cat클래스를 Animal타입의 변수 animal에 대입하기 위해 자동 타입변환
		animal = new Cat();
		animal.sound();
		System.out.println("---------");
		
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
		
		public static void animalSound(Animal animal) {
			animal.sound();
		}
		

	}


