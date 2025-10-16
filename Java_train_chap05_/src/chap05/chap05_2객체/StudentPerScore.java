package chap05.chap05_2객체;

public class StudentPerScore {

	public static void main(String[] args) {
		// int [] score = new int[5]; 객체배열
		Student[] score = new Student[5]; // 타입에 객체이름을 넣어서 Student 클래스에 접근
		//ArrayList<Student> score = new ArrayList<>();
		
		for(int i = 0; i < score.length; i++) {
			score[i] = new Student();
		}
		
		int sum = 0;
		double avg = 0;
		//영희에 대한 정보(이름, 국어, 영어, 수학)
		//영희의 총점과 평균
		score[0].name = "영희";
		score[0].kor = 89;
		score[0].eng = 90;
		score[0].math = 70;
		
		//영희 총점
		sum = score[0].total();
		//영희 평균
		avg = score[0].avg();
		System.out.println(score[0].name + "의 총합: " + sum);
		System.out.println(score[0].name + "의 평균: " + avg);
	}

}
