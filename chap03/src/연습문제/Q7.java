package 연습문제;

public class Q7 {
	public static void main(String[] args) {
		double var1 = 10; //float의 정밀도 문제
		double var2 = var1 / 100;
		System.out.println(var2);
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
	}
}
