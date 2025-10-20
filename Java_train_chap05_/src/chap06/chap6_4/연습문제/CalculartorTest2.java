package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class CalculartorTest2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in); // 외부에서 Scanner 생성

        Calculator myCalc = new Calculator(0, 0, scanner); // 초기값은 임시
        myCalc.cal(); // 사용자 입력 기반 계산 수행

        scanner.close(); // 마지막에 닫기
		 
		 
	}

}
