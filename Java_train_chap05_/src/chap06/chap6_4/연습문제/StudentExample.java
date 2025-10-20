package chap06.chap6_4.연습문제;

public class StudentExample {

	public static void main(String[] args) {
		Student stu1 = new Student("홍길동", 1, 87, 90, 95);
		
		int sum = stu1.getTotal();
		float avg = stu1.getAverage();
		
		System.out.println("총합: " + sum + ", 평균: " + avg);

	}

}
