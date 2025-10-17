package chap06.객체활용;

public class ScoreMain {

	public static void main(String[] args) {
		//홍길동 정보
		Score score1 = new Score();
		score1.name = "홍길동";
		score1.kor = 80;
		score1.math = 68;
		score1.eng = 77;
		
		//이몽룡
		Score score2 = new Score();
		score2.name = "이몽룡";
		score2.kor = 73;
		score2.math = 86;
		score2.eng = 67;
		
		//최사또
		Score score3 = new Score();
		score3.name = "최사또";
		score3.kor = 55;
		score3.math = 76;
		score3.eng = 97;
	}

}
