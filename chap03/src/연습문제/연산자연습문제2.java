package 연습문제;

public class 연산자연습문제2 {

	public static void main(String[] args) {
		int a = 123;
		int b = 10;
		int result;
		
		if(a % b >= 1) {
			result = (a / b) + 1;
		} else {
			result = a / b;
		}
		
		System.out.println(result); 
		
	}

}
