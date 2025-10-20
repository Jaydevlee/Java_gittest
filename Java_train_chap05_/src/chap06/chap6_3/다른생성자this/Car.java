package chap06.chap6_3.다른생성자this;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){
		this(model, "은색", 250);
		//this.model = model;
		//this.color = "은색";
		//this maxSpeed = 250; 
	}
	Car(String model, String color) {
		this(model, color, 250);
		//this.model = model;
		//this.color = color;
		//this maxSpeed = 250; 
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
