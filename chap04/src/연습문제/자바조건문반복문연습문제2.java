package 연습문제;


public class 자바조건문반복문연습문제2 {

	public static void main(String[] args) {
		int[] nums = {3, 4, 5, 6, 7};
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("\"홀수" + odd + "개, 짝수" + even + "개\"");
	}
}