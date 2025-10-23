package chap07.sec02.강제타입변환;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); //자동 형변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "data2";
		parent.method3(); override 되지 않았으므로 강제 형변환이 필요하다.
		*/
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();

	}

}
