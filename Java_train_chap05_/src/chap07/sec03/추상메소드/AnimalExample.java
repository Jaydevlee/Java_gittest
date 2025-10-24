package chap07.sec03.추상메소드;

public class AnimalExample {

	public static void main(String[] args) {
		/* Animal animal = new Animal();
		 * new 연산자 사용 x 추상 클래스에 직접 접근할 수 있는 방법이 없다*/
		//dog가 Dog 클래스 참조
		Dog dog = new Dog();
		//cat이 Cat 클래스 참조
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		//변수와 자동 타입 변환
		//필드의 다형성
		//Animal 타입의 변수 animal이 아무것도 참조하지 않음
		Animal animal = null;
		//Dog 클래스를 Animal 타입의 변수 animal에 대입하기 위해 자동 타입변환
		animal = new Dog(); // Dog 클래스의 새로운 주소 저장
		animal.sound();
		
		//Cat 클래스를 Animal 타입의 변수 animal에 대입하기 위해 자동 타입변환
		animal = new Cat(); // Cat 클래스의 새로운 주소 저장
		animal.sound();
		animal.sound();
		System.out.println("---------");
		
		
		//메소드의 다형성
		//자기 자신의 메소드를 호출할 때는 메소드 이름만 가져온다.
		animalSound(new Dog());
		animalSound(new Cat());
	}
		//단, 자기자신의 메소드를 선언할 경우 static을 붙여야 한다.
		public static void animalSound(Animal animal) {
			animal.sound();
		}
		//재귀호출: 선언과 동시에 호출

	}


