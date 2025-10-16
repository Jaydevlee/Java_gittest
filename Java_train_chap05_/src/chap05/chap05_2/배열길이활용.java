package chap05.chap05_2;

public class 배열길이활용 {

	public static void main(String[] args) {
		int [] scores = {83, 90, 87};

		int sum = 0;
		for(int i = 0; i < scores.length; i++) { //배열 길이 활용에서 <연산자를 사용한이유, 마지막 인덱스 번호가 길이보다 1이 작기 때문
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균: " +  avg);

	}

}
