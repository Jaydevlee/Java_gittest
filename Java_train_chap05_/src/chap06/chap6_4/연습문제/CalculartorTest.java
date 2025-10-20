package chap06.chap6_4.연습문제;

import java.util.Scanner;

public class CalculartorTest {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator(7, 3);
		 int result1 = myCalc.getAdd();
		 System.out.println(result1);
		 
		 int result2 = myCalc.getSub();
		 System.out.println(result2);
		 
		 int result3 = myCalc.getMul();
		 System.out.println(result3);
		 
		 double result4 = myCalc.getDiv();
		 System.out.println(result4);
		 
	}

}
