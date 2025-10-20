package chap06.chap6_4.확인문제;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10); //return이 선언됐으면 System.out.println(Printer.println(10));
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
