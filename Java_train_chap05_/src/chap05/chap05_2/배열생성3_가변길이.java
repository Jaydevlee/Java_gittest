package chap05.chap05_2;

import java.util.ArrayList;

public class 배열생성3_가변길이 {

	public static void main(String[] args) {
		 int mathScore [] = new int[5];
		 mathScore[0] = 80; //영희
		 mathScore[1] = 90; //철수 
		 mathScore[2] = 75; //길동
		 mathScore[3] = 70; //춘향
		 mathScore[4] = 68; // 몽룡
		 
		 ArrayList<Integer> mathScore1 = new ArrayList<>();
		 mathScore1.add(80);
		 mathScore1.add(90);
		 mathScore1.add(75);
		 mathScore1.add(70);
		 mathScore1.add(68);

	}

}
