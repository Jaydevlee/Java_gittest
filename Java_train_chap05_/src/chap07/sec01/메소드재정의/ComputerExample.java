package chap07.sec01.메소드재정의;

public class ComputerExample {

	public static void main(String[] args) {
		//Calculator의 기본생성자 호출
		Calculator cal = new Calculator();
		
		int r = 10;
		
		System.out.println("원면적: " + cal.areaCircle(r));
		System.out.println();
		
		//Computer의 기본생성자 호출
		Computer com = new Computer();
		System.out.println("원면적: " + com.areaCircle(r));
		

	}

}
