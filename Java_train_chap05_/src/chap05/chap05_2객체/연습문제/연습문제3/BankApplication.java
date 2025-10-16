package chap05.chap05_2객체.연습문제.연습문제3;

import java.util.Scanner;

public class BankApplication {
	 private static Account[] accountArray = new Account[100];
	 private static Scanner s = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 // Account 배열에서 ano와 동일한 Account1객체 찾기
		 for(int i = 0; i < accountArray.length; i++) {
			 accountArray[i] = new Account(null, null, i);
		 }
		 boolean run=true;
		 while(run) {
			 System.out.println("---------------------------------------------");
			 System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금  | 4. 출금 | 5. 종료");
			 System.out.println("---------------------------------------------");
	   
			 System.out.print("선택> ");
	   
			 int selectNo=s.nextInt();
	   
			 if(selectNo==1) {
				 createAccount();
			 }else if(selectNo==2) {
				 accountList();
			 }else if(selectNo==3) {
				 deposit();
			 }else if(selectNo==4) {
				 withdraw();
			 }else if(selectNo==5) {
				 run = false;
			 }
		 }
		 System.out.println("프로그램 종료");
	 	}
	 
	

	 // 계좌목록보기

	 // 예금하기

	 // 출금하기

	 
	}
