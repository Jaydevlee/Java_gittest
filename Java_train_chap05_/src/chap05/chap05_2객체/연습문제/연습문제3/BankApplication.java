package chap05.chap05_2객체.연습문제.연습문제3;

import java.util.Scanner;

public class BankApplication {
	//객체 배열 생성
	 private static Account[] accountArray = new Account[100];
	 private static Scanner s = new Scanner(System.in);

	 
	 public static void main(String[] args) {
		 boolean run=true;
		 while(run) {
			 System.out.println("---------------------------------------------");
			 System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금  | 4. 출금 | 5. 종료");
			 System.out.println("---------------------------------------------");
	   
			 System.out.print("선택> ");
			 int selectNo=s.nextInt();
			 s.nextLine();
	   
			 if(selectNo==1) {
				creatAccount(); //new키워드를 사용해서 호출하지 않았으므로 정적 메소드
				
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
	
	 //계좌 선언하기
	static void creatAccount() {
		
		 System.out.println("------");
		 System.out.println("계좌생성");
		 System.out.println("------");
		 // 사용자가 입력한 계좌번호를 저장
		 System.out.print("계좌 번호 : ");
		 String ano = s.nextLine();
		 //중복계좌 방지
		 if(findAccount(ano) != null) {
			 System.out.println("이미 존재하는 계좌번호");
			 return;
		 }
	
		 System.out.print("계좌주 : ");
		 String owner = s.nextLine();
	
		 System.out.print("초기입금액 : ");
		 int balance = 0;
		 try {
			 balance = Integer.parseInt(s.nextLine());
		 } catch (NumberFormatException e) {
			 System.out.println("숫자만 입력해주세요");
			 return;
		 }
		 
		 for(int i = 0; i < accountArray.length; i++) {
			   	if(accountArray[i] == null){
			   		accountArray[i] = new Account(ano, owner, balance);
				 System.out.println("결과: 계좌가 생성되었습니다.");
				 break;
			 }
			 
		 }
	 }
	 // 계좌목록보기
	static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		   for(Account acc : accountArray) {
		   	if(acc != null){
		   		System.out.println(acc.getAno() + " " + acc.getOwner() + " " + acc.getBalance()); 
		   		}
		   }
		}
		

	 // 예금하기
	static void deposit() {
		System.out.println("---");
		System.out.println("예금");
		System.out.println("---");
		
		System.out.print("계좌번호 : ");
		String ano = s.nextLine();
		
		Account acc = findAccount(ano); //계좌번호 값을 findAccount메소드에 인수값으로 전달
		if(acc == null) { //사용자가 입력한 계좌번호가 없으면
			System.out.println("계좌번호가 없음");
		} else {
			int amount = 0;
			System.out.print("예금액 : ");
			try {
			amount = Integer.parseInt(s.nextLine()); //예금액 입력
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력가능 합니다.");
			}
			//현재 통장에 있는 금액 = 초기입금핵 + 예금액
			acc.setBalance(acc.getBalance() + amount);
		}
		
	}

	 // 출금하기
	static void withdraw() {
		System.out.println("---");
		System.out.println("출금");
		System.out.println("---");
		
		System.out.print("계좌번호 : ");
		String ano = s.nextLine();
		
		Account acc = findAccount(ano); //계좌번호 값을 findAccount메소드에 인수값으로 전달
		if(acc == null) { //사용자가 입력한 계좌번호가 없으면
			System.out.println("계좌번호가 없음");
		} else {
			System.out.print("출금액 : ");
			int amount = 0;
			try {
			amount = Integer.parseInt(s.nextLine()); //예금액 입력
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력가능 합니다.");
			}
			//현재 통장에 있는 금액 = 초기입금핵 + 예금액
			acc.setBalance(acc.getBalance() - amount);
		}
		}
	 
	//Account 배열에서 ano와 동일한 Account1객체 찾기
		static Account findAccount(String ano) {
			for(Account acc : accountArray) {
				if(acc != null && acc.getAno().equals(ano)) {
					return acc;
				}
			}
			return null;
		}
	}
