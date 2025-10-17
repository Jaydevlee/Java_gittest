package chap05.chap05_2;

public class 확인문제5 {
	public static void main(String[] args ) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0;
		int cunt = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) { //array[2].length가 아니다.
				sum += array[i][j];
				cunt++;
			}
		}
		avg = (double)sum / cunt;
		System.out.println(sum);
		System.out.println(avg);
	}
}
