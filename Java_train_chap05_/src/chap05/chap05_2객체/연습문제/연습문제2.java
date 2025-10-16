package chap05.chap05_2객체.연습문제;

import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		int nums [] = new int[5];
		System.out.println("입력: ");
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt(); //5번 입력해야 하니까 입력부분을 반복문 안으로
			sum += nums[i];
		}
		
		double avg = (double)sum / nums.length; 
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		s.close();
	} 

}
