package sec06.exam02.mycompany;

//hankook패키지 내부의 모든 클래스를 사용
import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine; // 다른 패키지에 있는 클래스를 사용
import sec06.exam02.kumho.BigWidthTire;
public class Car {
	//필드
	//기본형 필드
	//int number;
	//참조형 필드y
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//패키지 명을 직접 입력하는 방법
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}
