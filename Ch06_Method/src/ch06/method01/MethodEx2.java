package ch06.method01;

import java.util.Scanner;

// 메서드를 만들기 전 코드
public class MethodEx2 {
	// main 메서드 내의 계산하는 부분을 옮긴다.
	public static void calcArith(int num0, int num1, String op) {
		int result = 0;		// 결과값 저장 변수
		
		// 2) 계산을 하는 부분
		switch(op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default:
			System.out.println("연산이 불가능합니다.");
			break;
		}
		
		// 3) 결과값 출력
		System.out.println("결과값은 " + result + "입니다.");
	}
	
	public static void main(String[] args) {
	
		calcArith(1, 2, "+");		
		
	
	}
}






