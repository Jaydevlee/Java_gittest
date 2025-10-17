package chap05.chap05_2객체.연습문제;

public class 연습문제1 {

	public static void main(String[] args) {
		//배열 생성
		int[] scores = {80, 74, 63, 97, 88};
		int maxScore = 0;
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		double avg = (double)sum / scores.length;
		System.out.println("총점: " + sum + ", 평균 " + avg + ", 최대점수 " + maxScore);
	}

}
