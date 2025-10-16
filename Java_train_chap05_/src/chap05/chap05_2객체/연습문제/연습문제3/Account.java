package chap05.chap05_2객체.연습문제.연습문제3;

import java.util.Scanner;

public class Account {
	
	//필드 부분 객체의 값을 저장
	//private 외부에서 직접 접근 불가
	private String ano;
	private String owner;
	private int balance;
	
	//생성자 부분: 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당
	//객체 초기화: 필드를 초기화하거나 메소드를 호출해서 객체를 사용할 준비를 하는 것
	 Account(String ano,String owner,int balance){//생성자 부분:
		  this.ano=ano;
		  this.owner=owner;
		  this.balance=balance;
		 }

		 public String getAno() {return ano;}
		 public void setAno(String ano) {this.ano = ano;}
		 public String getOwner() {return owner;}
		 public void setOwner(String owner) {this.owner = owner; }
		 public int getBalance() {return balance;}
		 public void setBalance(int balance) {this.balance = balance;}
		
	
	// 계좌생성하기
	Account createAccount() {
		Scanner s = new Scanner(System.in);
		System.out.println("계좌번호: ");
		ano = s.nextLine();
		System.out.println("계좌주: ");
		owner = s.nextLine();
		System.out.println("초기입금액: ");
		balance = Integer.parseInt(s.nextLine());
		return new Account(ano, owner, balance);
	
	}
}

