package chap06.chap6_4.연습문제;

public class Solution {
    int a;
    int b;


    int cal(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if(a > b){
            for (int i = a; i >= b; i--) {
                sum += i;
            }
        } else {
        	return a;
        }
        return sum;
    }
}



