package 연습문제;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in); //변수이름 scanner는 다른 이름을 써도 무방
		
		//첫번째 수
		System.out.print("첫 번째 수: ");
		String num1 = s.nextLine();         //double num1 = s.nextDouble(); 꼭 문자열로 받을 필요없다.
		
		//두 번째 수
		System.out.print("두 번째 수: ");
		String num2 = s.nextLine();         //double num2 = s.nextDouble();
		
		if(num2.equals("0") || num2.equals("0.0")) { //위에서 기본형으로 받았을 경우, (num2 == 0 || num2 == 0.0)
			System.out.println("결과: 무한대");
		} else {
			double result = Double.parseDouble(num1) / Double.parseDouble(num2);
			System.out.println("결과: " + result);
		}
		s.close();
	}

}
