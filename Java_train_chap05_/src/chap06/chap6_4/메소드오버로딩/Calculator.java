package chap06.chap6_4.메소드오버로딩;

public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) { //정사각형의 넓이
		return width * width;
	}
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
