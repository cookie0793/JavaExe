package ch06.method01;

import java.util.Scanner;

// 메서드를 만들기 전 코드
public class MethodEx3 {
	
	// num0과 num1은 add함수의 지역변수이다.
	public static int add(int num0, int num1) {
		int result = num0 + num1;
		return result;
	}
	
	public static void main(String[] args) {
		int result = add(11, 5);
		System.out.println("결과값은 " + result);
		
		// main함수의 지역변수로 Stack에 num0과 num1이 초기화되어 생성된다.
		int num0 = 10, num1 = 5;
		int result1 = add(num0, num1);
		System.out.println("결과값은 " + result1);
		
		int a = 3, b = 7;
		int result2 = add(a, b);
		System.out.println("결과값은 " + result2);
	}
}






